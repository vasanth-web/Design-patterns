package com.SingletonPattern;

public class Main {

	public static void main(String[] args) {

		Singleton x = Singleton.createSingleton(); 
		
		Singleton y = Singleton.createSingleton(); 
		
		Singleton z = Singleton.createSingleton(); 
		
		x.str = x.str.toUpperCase();
		
		System.out.println("String from x is "+x.str);
		System.out.println("String from y is "+y.str);
		System.out.println("String from z is "+z.str);
		
		System.out.println("\n");
		 
        z.str = (z.str).toLowerCase();
 
        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
	}

}
