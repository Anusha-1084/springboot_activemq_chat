package com.example.springboot_activemq_chat.producer;

import com.example.springboot_activemq_chat.model.ChatMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ChatProducer {

    private final JmsTemplate jmsTemplate;

    public ChatProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String queueName, ChatMessage message) {
        jmsTemplate.convertAndSend(queueName, message);
        System.out.println("Sent: " + message);
    }
}
