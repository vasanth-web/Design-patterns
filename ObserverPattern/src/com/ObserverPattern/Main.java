package com.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product samsungLEDTV = new Product("Samsung LED TV", "LED TV","60000Rs", "Not available");
		 
		Person david = new Person("David",samsungLEDTV);
		Person john = new Person("John",samsungLEDTV);

		ArrayList<Observer> subscribers= samsungLEDTV.getObservers();
		System.out.println("subscribers List : "+ subscribers);
		
		for( Iterator<Observer> iterator = subscribers.iterator(); iterator.hasNext(); ) {
             Person person = (Person) iterator.next();
             System.out.println("This person has subscribed : " + person.getPersonName());                 
        }
		
		System.out.println();
		System.out.println("SamsungLED TV current state : "+samsungLEDTV.getAvailability());
		System.out.println();
		 
		samsungLEDTV.setAvailability("Available");
	}

}
