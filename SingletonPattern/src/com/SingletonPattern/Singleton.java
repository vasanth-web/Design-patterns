package com.SingletonPattern;

public class Singleton {
	
	private static Singleton single_instance = null;
	
	public String str = "Hello World!";
	
	private Singleton() {
		
	}
	
	//Lazy initialization
	public static Singleton createSingleton() {
		if(single_instance == null) {
			single_instance =  new Singleton();
		}
		return single_instance;
	}	
	public void print() {
		System.out.println("Printer started printing");
	}
}
