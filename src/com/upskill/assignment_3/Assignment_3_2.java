package com.upskill.assignment_3;

public class Assignment_3_2 {
	
	/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */

	static int count = 1;
	
	Assignment_3_2(String name, int age, int salary, String address){
		System.out.println("Employee Number: " +count++);
		System.out.println("Employee Name: " +name);
		System.out.println("Employee Age: " +age);
		System.out.println("Employee Salary: " +salary);
		System.out.println("Employee Address: " +address);
	}
	
	
	public static void main(String[] args) {
		
		Assignment_3_2[] obj = new Assignment_3_2[5];
		obj[0]=new Assignment_3_2("Ashik",38,120000, "Buffalo");
		obj[1]=new Assignment_3_2("md",35,100000, "Cheektowaga");
		obj[2]=new Assignment_3_2("Rahman",39,130000, "Buffalo");
		obj[3]=new Assignment_3_2("Jisan",28,140000, "Bronx");
		obj[4]=new Assignment_3_2("Mahdi",22,120000, "Jamaica");
		

	}

}
