package com.CompositePattern;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new AssociateProfessor(101,"Sohan Kumar", 20000.0);  
        Employee emp2 = new AssociateProfessor(102,"Mohan Kumar", 25000.0);  
        Employee emp3 = new AssistantProfessor(103,"Seema Mahiwal", 30000.0);   
        Employee hod1 = new SeniorProfessor(100,"Ashwani Rajput",100000.0);  
           
         hod1.add(emp1);  
         hod1.add(emp2);  
         hod1.add(emp3);  
         hod1.print(); 
	}
}
