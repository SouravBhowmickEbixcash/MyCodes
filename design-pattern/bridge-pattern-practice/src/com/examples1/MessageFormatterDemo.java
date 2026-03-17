package com.examples1;

public class MessageFormatterDemo {
	
	public static void main (String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms = new SmsSender();
        Message m1 = new TextMessage(email, "Hello there");
        Message m2 = new UrgentMessage(sms, "Server is down");
        m1.send();
        m2.send();
	} 
}
