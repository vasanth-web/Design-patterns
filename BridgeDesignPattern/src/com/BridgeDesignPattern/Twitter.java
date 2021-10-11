package com.BridgeDesignPattern;

public class Twitter implements MessagePublisher{
	public void publishMessage(String message) {
		System.out.println(message + " : This message in Twitter");
	}
}