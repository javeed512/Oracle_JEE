package com.example.jms.reciever;

import java.time.LocalTime;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReciever {

	@JmsListener(destination = "test-message")
	public void receiveMessage(String message) {
		
		System.out.println(LocalTime.now());
			System.out.println("The message was : "+message);
		
	}
	
	
}
