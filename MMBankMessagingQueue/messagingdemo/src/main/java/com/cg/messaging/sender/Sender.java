package com.cg.messaging.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component 
@Lazy
public class Sender {
	
	@Autowired
	private RabbitMessagingTemplate template;
	
	@Bean
	public Queue queue() {
		return new Queue("helloworld", false);
	}

	
	public void message(@PathVariable String message) {	
		template.convertAndSend("helloworld",message);
	}
}
