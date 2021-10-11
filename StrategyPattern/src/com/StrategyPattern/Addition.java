package com.StrategyPattern;

public class Addition implements Strategy{
	public int calculate(int number1, int number2) {
		return number1+number2;
	}
}
