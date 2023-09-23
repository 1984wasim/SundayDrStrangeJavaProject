package com.upskill.assignment_2;

public class Assignment_2_9 {
	
	/*Write a program to swap two string variables (Talen, Tech) and display result on the 
    screen.*/

	public static void main(String[] args) {
		
		String a = "Talen";
		String b = "Tech";
		
		System.out.println("Before swapping: "+a+ " "+b);
		
		/*1. append a and b:
		//a = a+b;  //TalenTech
		
		Store initial string a in String b:
		
		b = a.substring(0, a.length()-b.length());
		
		Store initial string b in String a:
		
		a = a.substring(b.length());*/
		
		
		
		String j = a;  //third variable
		a=b;
		b=j;
		
		
		System.out.println("After swapping: "+a+ " "+b);
		

	}

}
