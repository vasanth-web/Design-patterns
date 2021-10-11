package com.ChainOfResponsibiltyPattern;

public class TeamLeader extends Employee {
	
	 private int MAX_LEAVES_CAN_APPROVE = 10;

	 public void applyLeave( String employeeName, int numberofDaysLeave )
	 {
		 if(numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE ) {
			 ApproveLeave(employeeName, numberofDaysLeave);
		 }
		 else {
			 supervisor.applyLeave(employeeName, numberofDaysLeave);
		 }
	 }

	 private void ApproveLeave( String employeeName, int numberofDaysLeave ) {
		 System.out.println("TeamLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
	                 + employeeName);
	 }
}
