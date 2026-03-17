package com.examples1;

public class EmailSender implements MessageSender{

	@Override
	public void sendMessage(String message) {
		System.out.println("EMAIL : " + message);
		
	}

}
