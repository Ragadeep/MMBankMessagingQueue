package com.cg.messagingreceiver.receiver;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@Bean
	public Queue queue() {
		return new Queue("helloworld", false);
	}

	@RabbitListener(queues = "helloworld")
	public void processMessage(String message) {
	System.out.println("message; "+ message);
	}
}
