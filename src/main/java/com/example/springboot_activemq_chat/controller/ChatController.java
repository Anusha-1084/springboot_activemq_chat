package com.example.springboot_activemq_chat.controller;

import com.example.springboot_activemq_chat.model.ChatMessage;
import com.example.springboot_activemq_chat.producer.ChatProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatProducer chatProducer;

    public ChatController(ChatProducer chatProducer) {
        this.chatProducer = chatProducer;
    }

    @PostMapping("/send")
    public String send(@RequestBody ChatMessage message) {
        // sender is sending to receiver's queue
        chatProducer.sendMessage(message.getReceiver() + "-queue", message);
        return "Message sent!";
    }
}
