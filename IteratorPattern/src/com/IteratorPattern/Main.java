package com.IteratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionOfStrings repository = new CollectionOfStrings();  
        
		Iterator iterator = repository.getIterator();
        while(iterator.hasNext()) {  
            
        	String name = (String)iterator.next();  
            System.out.println("Name : " + name);  
         }      
	}

}
