package com.upskill.java_1;

public class Variables {  // Variables in Java - Instance or global, Static, Local, Method Parameter, and Final variable
	
	public static void main(String[] args) {
		Variables obj = new Variables();
		
		obj.texas("Biriyani");
		
		System.out.println(obj.country);
		System.out.println(president);
	}
	
	String country = "USA";   //Instance OR global variable - variables declared in class level, outside method
	
	static String president = "Biden";  //Static variable - variables belong to class and don't required creating object
	
	public static void newyork(){
		String city = "Queens";    //Local variable - variables declared within a method, Constructor or a block of code('{}')
		String police = "NYPD";
		System.out.println(police);
	}
	
	
	public static void texas(String food){  //Method parameter - passing data from outside to inside of method
		String city = "Austin";
		String police = "APD";
		System.out.println(police);
		System.out.println(food);
	}
	public class constants{
		final int maxValue = 100;  //Final variable - declared with the Final keyword and assigned value cann't be changed (constants)
	}
	
	
}
