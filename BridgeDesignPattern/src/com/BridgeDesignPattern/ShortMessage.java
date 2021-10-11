package com.BridgeDesignPattern;

public class ShortMessage extends Message{
	
	static int MESSAGE_LENGTH = 20;
	
	public void publishMessage(String message) {
		if (message.length() <= MESSAGE_LENGTH){
			messagePublisher.publishMessage(message);
		}
		else {
			System.out.println("Length should not exceed 20 characters.");
		}
	}
}	
