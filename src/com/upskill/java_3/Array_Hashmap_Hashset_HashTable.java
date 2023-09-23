package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data using index
		
		int age = 30;
		int[] ageDrStrange = new int[]{25, 21, 30, 35, 28};
		
		//Array index					[0] [1] [2] [3] [4]
		
		System.out.println(age);
		System.out.println(ageDrStrange[1]);
		System.out.println("Total Number Students : "+ageDrStrange.length);
		
		String [] nameDrStrange = new String[]{"Ashik", "Jisan", "Tareq", "Joynal", "Mahadi"};
		
		System.out.println(nameDrStrange[0]);
		System.out.println("Total Number Students : "+nameDrStrange.length);
		
		
		//Multi- Dimentional Array
		
		int[][] ageDrStrange2D = {{25, 21, 30, 35, 28},  //[0][0] [0][1]
									{31, 32, 36}};       //[1][0] [1][1]
		
		System.out.println(ageDrStrange2D[0][2]);
		
		//Hashmap store multiple data using key-value pair, Implementation of Map interface	
		
		HashMap<String, Integer> Student = new HashMap <String, Integer>();
		
		Student.put("Ashik", 38);
		Student.put("Jisan", 22);
		Student.put("Adnan", 32);
		Student.put("Jay", 25);

		
		System.out.println("Student age is : "+Student.get("Ashik"));
		
		
		HashMap<String, String> Capital = new HashMap <String, String> ();
		
		
		
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("USA", "Washington DC");
		Capital.put("India", "Dilli");
		
		
		System.out.println("Capital City is :"+Capital.get("Bangladesh"));
		
		
		//Hashset store unordered collection containing unique value, Implementation of Map interface	
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Tesla");
		
		System.out.println(car);
		
		
		//HashTable store multiple data using key-value pair, No duplicate,
		//also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : "+Region.get("BD"));
		
		}

	}


