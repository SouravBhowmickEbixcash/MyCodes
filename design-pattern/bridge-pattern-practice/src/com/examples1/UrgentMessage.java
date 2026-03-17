package com.examples1;

public class UrgentMessage extends Message{

	public UrgentMessage(MessageSender sender, String content) {
		super(sender, content);
	}

	@Override
	public void send() {
		sender.sendMessage(content);
		
	}

}
