package com.upskill.assignment_2;

public class Assignment_2_8 {
	
	//Write Java Program to display Factorial of Number 7.

	public static void main(String[] args) {
		
		int i;
		int result = 1;
		int j =7;  //it is the number to calculate factorial  (7*6*5*4*3*2*1 =5040)
		
		//for(i=1; i <=j; i++){  //for (i=7; i>=1; i--){
		
			for (i=7; i>=1; i--){
			result = result*i;
		}
		
		System.out.println("Facturial of Number 7 is: "+result);
	}

}
