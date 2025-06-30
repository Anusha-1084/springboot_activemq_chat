package com.example.springboot_activemq_chat.model;

public class ChatMessage {
    private String sender;
    private String receiver;
    private String content;

    // Constructors
    public ChatMessage() {}

    public ChatMessage(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    // Getters and setters
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public String getReceiver() { return receiver; }
    public void setReceiver(String receiver) { this.receiver = receiver; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public String toString() {
        return sender + " to " + receiver + ": " + content;
    }
}
