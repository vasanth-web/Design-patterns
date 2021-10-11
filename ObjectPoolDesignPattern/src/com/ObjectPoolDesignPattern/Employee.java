package com.ObjectPoolDesignPattern;

public class Employee extends Thread{
	String EmployeeName;
	
	public Employee(String name) {
		this.EmployeeName = name;
	}
	
	public void work() throws InterruptedException {
		System.out.println("Employee :"+ EmployeeName+" is doing the work.");
		//Doing some work!
		Thread.sleep(10000);
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + "]";
	}
}
