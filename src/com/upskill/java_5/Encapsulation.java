package com.upskill.java_5;

public class Encapsulation {
	
	private String name="sami";  // write and read
	private int ssn=1234567;        // write
	private String username="sami123";    //read
			
	//Setter Method- name
	public void setName(String value){      //set the data- write
	name=value;
	}
	
	// getter method
	public String getName(){         //// get the data-read
		return name;
		
	}
	// System.out.println(obj.getName());
	public  void setSSN1(int value){
		 ssn=value;
		
	}
	// getter method- username
	
	 public String getUserName(){
		 return username;
		 
		 
	 }
	
	public static void main(String[] args) {
		 Encapsulation obj=new  Encapsulation();
		 obj.setName("Sazzad");
		 System.out.println(obj.getName());
	
	
		obj.setSSN1(1234567);
		 System.out.println(obj.getUserName());
		
		
		
			 
		 }

	
	}

	

	



