package com.ChainOfResponsibiltyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TeamLeader teamLeader= new TeamLeader();
		 ProjectLeader projectLeader= new ProjectLeader();
		 HR hr=new HR();
		 
		 teamLeader.setNextSupervisor(projectLeader);
		 projectLeader.setNextSupervisor(hr);
		 
		 teamLeader.applyLeave("David", 2);
		 
		 teamLeader.applyLeave("John", 18);
		 
		 teamLeader.applyLeave("Steve", 30);
		 
		 teamLeader.applyLeave("Rohan", 50);
	}

}
