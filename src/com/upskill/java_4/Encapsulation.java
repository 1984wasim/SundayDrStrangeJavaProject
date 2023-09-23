package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
		
	private String name = "UpSkill";					//write & read
	private int ssn = 123456;							//write only
	private String username = "mdrahman";				//read only
	
	
	
	//Setter Method - ssn 								//set the data, Write
	
	public void setSSN(int value) {
		ssn = value;
	}
	
	//Getter Method - name 								//get the data, Read
	
	public String getUserName(){
		return username;
		
	}
	
	//Setter Method - name 								//set the data, write
	
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name 								// get the data, read
	
	public String getName(){
		return name;
		
	}
	
	public static void main(String[] args){
		
		Encapsulation obj = new Encapsulation();
		
		System.out.println(obj.getName());
		obj.setName("Ashik");
		System.out.println(obj.getName());
		obj.setSSN(567893);
		System.out.println(obj.getUserName());
		
			}

}
