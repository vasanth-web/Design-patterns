package com.BridgeDesignPattern;

public class Facebook implements MessagePublisher{
	public void publishMessage(String message) {
		System.out.println(message + " : This message in Facebook");
	}
}
