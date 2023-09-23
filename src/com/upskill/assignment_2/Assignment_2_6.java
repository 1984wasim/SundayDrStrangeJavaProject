package com.upskill.assignment_2;

public class Assignment_2_6 {
	//Write a java program to find the prime number from 1 to 100 and print them.

	public static void main(String[] args) {
		
		//A prime number is a whole number greater than 1 whose only factors are 1 and itself.
		//For example - 2,3,5,7,11,13,17,19,23.....
		// 2 is the ONLY EVEN prime number
		
		int i;
		int j;
		
		for (i=2; i<=100; i++){
			
			boolean isPrime = true;
			
			for(j=2; j<i; j++){	
				
				if(i%j ==0){
					isPrime = false;
					break;  //Jump out of a loop
				}
				
			}
			
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}




