package com.upskill.assignment_2;

import java.util.Scanner;

public class Assignment_2_10 {
	
	//Write a Java program to convert temperature from Fahrenheit to Celsius degree. 
	
	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner (System.in);
		
		float f;
		double cel;
		System.out.print("Enter Temperature in Fahrenheit : "); 
		
		f = user_input.nextFloat();
		cel = (f-32)/1.8;  //(68-32)/1.8 =36/1.8 =20 Celsius to Fahrenheit Formula: (°C * 1.8) + 32 = °F , Fahrenheit to Celsius Formula: (°F - 32) / 1.8 = °C

                                                           
		
		System.out.println("\nCelcius is : "+cel);
		
	}
}
	

