package com.BridgeDesignPattern;

public abstract class Message {
	public MessagePublisher messagePublisher;

	public MessagePublisher getMessagePublisher() {
		return messagePublisher;
	}

	public void setMessagePublisher(MessagePublisher messagePublisher) {
		this.messagePublisher = messagePublisher;
	}
	
	abstract public void publishMessage(String message);
}
