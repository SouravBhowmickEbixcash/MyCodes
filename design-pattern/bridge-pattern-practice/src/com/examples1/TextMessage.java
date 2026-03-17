package com.examples1;

public class TextMessage extends Message{

	public TextMessage(MessageSender sender, String content) {
		super(sender, content);
	}

	@Override
	public void send() {
		sender.sendMessage(content);
		
	}

}
