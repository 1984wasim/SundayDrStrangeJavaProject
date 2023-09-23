package com.upskill.java_3;

public class practiceArray {

	public static void main(String[] args) {
		
		int[] studentRollList = new int[]{8,5,2,7,9,2,10,6};
		
		System.out.println(studentRollList[3]);
		System.out.println("the total number of student is "+studentRollList.length);

		String[] studentName = new String[] {"ashik","Md","Rahman","Alina"};
		
	

		System.out.println(studentName[3]);
		System.out.println("the total number of student is "+studentName.length);
		
		int[][] studentAge = new int[][]{{8,5,2,7,9,2,10,6},{30,4,43,23,56,78,98,34}};
		System.out.println(studentAge[0][3]);
		System.out.println(studentAge[1][3]);
}
}

