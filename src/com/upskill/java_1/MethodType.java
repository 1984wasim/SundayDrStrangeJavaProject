package com.upskill.java_1;

public class MethodType {

	/* Types of Methods
	 * 1. Void Method - doesn't return any value and create object
	 * 2.Static Method - doesn't create object
	 * 3. Return Type Method - must return value and create a object
	 */
		public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		
		System.out.println("My Name is " +name()); //Static keyword is used and thats why no object created
	}
	
	static int hourlyIncome = 45;
	
		//Void Method
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " +calculateAnnualIncome);
	}

	//static method
	
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " +calculateWeeklyIncome);
	}
	
		//Return type method
	
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	//Return type with static keyword
	
    public static String name(){
		
		return "Ashik";
	}
	
}
