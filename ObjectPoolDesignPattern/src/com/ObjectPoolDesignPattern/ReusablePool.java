package com.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ReusablePool extends Thread{
	static ReusablePool single_instance = new ReusablePool();
	
	int DEFAULT_POOL_SIZE = 2;
	
	List<Employee> employees = new ArrayList<>(DEFAULT_POOL_SIZE);
	
	List<Employee> free = new ArrayList<>(DEFAULT_POOL_SIZE);
	List<Employee> used = new ArrayList<>(DEFAULT_POOL_SIZE);

	private ReusablePool() {
		
		Employee employee1 = new Employee("Jack");
		Employee employee2 = new Employee("Hanok");
		
		employees.add(employee1);
		employees.add(employee2);
		
		free.add(employee1);
		free.add(employee2);
	}
	
	public static ReusablePool getSingleton() {
		return single_instance;
	}
	
	public synchronized Employee getInstance() throws InterruptedException {
		if(free.isEmpty()) {
			System.out.println("All objects are in use. Kindly wait!");
			Thread.sleep(1000);
			return getInstance();
		}
		else {
			Employee employee = free.get(0);
			used.add(employee);
			free.remove(employee);
			return employee;
		}
	}
	public void releaseInstance(Employee employee) {
		used.remove(employee);
		free.add(employee);
	}
}
