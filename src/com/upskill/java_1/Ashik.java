package com.upskill.java_1;

public class Ashik {

	public static void main(String[] args) {
		
		//Ashik obj = new Ashik();
		//obj.Buffalo();
		
		Buffalo();
		
	}

	public static void Buffalo (){ //Static doesn't need to create obj
		int rent = 1000;
		String addrees = "33 susan";
		
		System.out.println("Address is: " +addrees);
		System.out.println("Rent is: " +rent);
	}
}
