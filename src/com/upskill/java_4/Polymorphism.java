package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	 * - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature/parameter to overload
	 * - Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */

	public static void main(String[] args) {
		
		car("Red", 4);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();

	}
	
	//Method Overloading - Compile time Polymorphism - Statice binding
	//Same method name with different signature/parameter
	
	public static void car(){
		System.out.println("My car is Tesla ");
	}
	
	public static void car(String Color){
		System.out.println("My car is Tesla, Its Color is "+ Color);
	}
	
	public static void car(String Color, int Seat){
		System.out.println("My car is Tesla, Its Color is "+ Color + ", Its has seat " + Seat);
	}
	
	public static void car(int door){
		System.out.println("My car is Tesla, Its has door  "+door);
	}
	
	
	//Method Overridding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
  public void annualIncomeVoid(){
	  
	  int pastAnnualIncome = 130000;
	  int rentalIncome=18000;
	  int sideIncome =15000;
	  int bonus = 25000;
	  int newIncome = pastAnnualIncome + rentalIncome + sideIncome + bonus;
	  System.out.println("My Annual Income = " + newIncome);
  }



}
