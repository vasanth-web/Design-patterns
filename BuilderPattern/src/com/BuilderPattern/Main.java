package com.BuilderPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.UserBuilder("Lokesh", "G")
			    .age(30)
			    .phone("1234567")
			    .address("address 1234")
			    .build();
			 
			    System.out.println(user1);
			 
			    User user2 = new User.UserBuilder("Jack", "R")
			    .age(40)
			    .phone("5655")
			    //no address
			    .build();
			 
			    System.out.println(user2);
			 
			    User user3 = new User.UserBuilder("Kenny", "M")
			    //No age
			    //No phone
			    //no address
			    .build();
			 
			    System.out.println(user3);
	}

}
