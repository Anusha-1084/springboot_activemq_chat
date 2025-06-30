package com.example.springboot_activemq_chat.consumer;

import com.example.springboot_activemq_chat.model.ChatMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ChatConsumer {

    @JmsListener(destination = "chat-queue")
    public void receiveMessage(ChatMessage message) {
        System.out.println("Received: " + message);
    }
}
