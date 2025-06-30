package com.example.springboot_activemq_chat;

import com.example.springboot_activemq_chat.model.ChatMessage;
import com.example.springboot_activemq_chat.producer.ChatProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootActivemqChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActivemqChatApplication.class, args);
	}

	@Bean
	public CommandLineRunner sendDemoMessage(ChatProducer producer) {
		return args -> {
			producer.sendMessage("chat-queue", new ChatMessage("Alice", "Bob", "Hello Bob!"));
			producer.sendMessage("chat-queue", new ChatMessage("Bob", "Alice", "Hi Alice! How are you?"));
		};
	}
}
