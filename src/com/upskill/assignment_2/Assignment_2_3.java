package com.upskill.assignment_2;

/*Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else)*/

public class Assignment_2_3 {
	
	public static int x;
	public static int y;
	
	public static void main(String[]args){
		
		x = myFunction1();
		 y = myFunction2();
		myMethod();
		
		
		}
	
	
	public static int myFunction1(){
		return 50;
	}
	public static int myFunction2(){
		return 70;
	
	}
	
	public static void myMethod(){
		
		if (x > y);
		{
			System.out.println("x is bigger than y ");
			
		if (x < y);
		{
			
			System.out.println("y is bigger than x ");
		}
		}
	}
}
	

