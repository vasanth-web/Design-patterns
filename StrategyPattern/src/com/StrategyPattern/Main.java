package com.StrategyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 7;
		
		Context context = new Context(new Addition());
		System.out.println("Addition :"+context.executeStrategy(num1, num2));
		
		context = new Context(new Multiplication());
		System.out.println("Multiplication :"+context.executeStrategy(num1, num2));

	}

}
