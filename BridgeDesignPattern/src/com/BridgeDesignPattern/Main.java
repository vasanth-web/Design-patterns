package com.BridgeDesignPattern;

public class Main {
	public static void main(String args[]) {
		
		
		String publisher = "Twitter";
		String message = "Hi, How are you?";
		
		if(("Twitter").equalsIgnoreCase(publisher)) {
			
			ShortMessage shortMessage = new ShortMessage();
			shortMessage.setMessagePublisher(new Twitter());
			shortMessage.publishMessage(message);
		}
		else {
			LongMessage longMessage = new LongMessage();
			longMessage.setMessagePublisher(new Facebook());
			longMessage.publishMessage(message);
		}
	}
}
