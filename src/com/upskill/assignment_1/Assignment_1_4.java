package com.upskill.assignment_1;

public class Assignment_1_4 {
	
	/*A function returns 30, another function returns 50. 
	 * Write a java program which will display subtraction value from bigger number to smaller.
	 */

  public static void main(String[] args) {
		
		int result = functionReturn50()-functionReturn30(); //  subtraction
		
		System.out.println("Subtraction value from bigger function to smaller ="+ result);
		
	}
	
	
	public static int functionReturn30(){
		return 30;
	}
	public static int functionReturn50(){
		return 50;
	}
	
	
	

}
