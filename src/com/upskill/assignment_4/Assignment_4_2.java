package com.upskill.assignment_4;

public class Assignment_4_2 {
	
	//2.	Write a method which will reverse a string 

	public static void main(String[] args) {
		reverseString("Ashik");
		

	}
	
	public static void reverseString(String input){
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
        	
            result[i] = strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result));
	}


}
