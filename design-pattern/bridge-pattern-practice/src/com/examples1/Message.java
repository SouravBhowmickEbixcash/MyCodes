package com.examples1;

public abstract class Message {
	
	protected MessageSender sender;
	protected String content;
	
	public Message(MessageSender sender, String content) {
		this.sender = sender;
		this.content = content;
	}
	
	public abstract void send();
}
