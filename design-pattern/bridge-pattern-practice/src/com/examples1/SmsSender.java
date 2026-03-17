package com.examples1;

public class SmsSender implements MessageSender{

	@Override
	public void sendMessage(String message) {
		System.out.println("SMS : " + message);
		
	}

}
