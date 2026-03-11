package com.example1;

public class Email {
	
	private String to;
	private String subject;
	private String cc;
	private String bcc;
	private String body;
	private String priority;
	private String attachment;
	
	private Email(Builder builder) {
		this.to = builder.to;
		this.subject = builder.subject;
		this.cc = builder.cc;
		this.bcc = builder.bcc;
		this.body = builder.body;
		this.priority = builder.priority;
		this.attachment = builder.attachment;
	}
	
	@Override
	public String toString() {
		return "to - " + to + "\nSubject - " + subject + "\ncc - " + cc + "\nbcc - " + bcc + "\nBody - " + body + "\nPriority - " + priority + "\nAttachment - " + attachment;   
	}
	
	public static class Builder {
		private String to;
		private String subject;
		private String cc;
		private String bcc;
		private String body;
		private String priority;
		private String attachment;
		
		public Builder(String to, String subject) {
			this.to = to;
			this.subject = subject;
		}
		
		public Builder cc(String cc) {
			this.cc = cc;
			return this;
		}
		
		public Builder bcc(String bcc) {
			this.bcc = bcc;
			return this;
		}
		
		public Builder body (String body) {
			this.body = body;
			return this;
		}
		
		public Builder priority(String priority) {
			this.priority = priority;
			return this;
		}
		
		public Builder attachment(String attachment) {
			this.attachment = attachment;
			return this;
		}
		
		public Email build() {
			return new Email(this);
		}
	}
	
	public static Builder builder(String to, String subject) {
		return new Builder(to, subject);
	}
}
