package com.sumant.boot.learning;

public class TestMessage {
	
	String message;
	String sender;
	
	public TestMessage() {
		
	}
	
	
	
	public TestMessage(String message, String sender) {
		super();
		this.message = message;
		this.sender = sender;
	}



	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", sender=" + sender + "]";
	}
	
	
}