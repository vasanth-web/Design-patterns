package com.BridgeDesignPattern;

public class LongMessage extends Message{
	public void publishMessage(String message) {
		messagePublisher.publishMessage(message);
	}
}	
