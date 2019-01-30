package com.cg.messaging.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.messaging.sender.Sender;

@RestController
public class Recource {
	
	@Autowired
	private Sender sender;
	
	@RequestMapping("/")
	public void demo() {
		sender.message("ragadeep");
	}
}
