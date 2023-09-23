package com.upskill.assignment_2;

public class Assignment_2_7 {
	
	/*You are given two integer number (a=25, b=30), write a program to swap them and 
    display result on the screen. 
    */   

	public static void main(String[] args) {
		
		int a = 25;
		int b = 30;
		
		System.out.println("Before swapping values are.."+a+" "+b);
		
		// logic 1 - third variable
		
		/*int t =a;
		a = b;
		b = t;*/
		
		//logic 2 - use + & - without using third variable
		
		a = a+b;   //a = 25+30 =55
		b = a-b;   //b =55 -30 = 25
		a = a-b;  //a =55 - 25 = 30
		
		System.out.println("After swapping values are.."+a+" "+b);
		

	}

}
