package com.upskill.java_5;

public class Assignment4_1 {
	
	
	
	
	
	
	public class Encapsulation {
		
		private String name="Saima";  // write and read
		private int password=1234567;        // write
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
		public  void setPassword(int value){
			 password=value;
			
		}
		// getter method- username
		
		 public String getUserName(){
			 return username;
			 
			 
		 }
		
		public void main(String[] args) {
			 Encapsulation obj=new  Encapsulation();
			 obj.getName();
			 System.out.println(obj.getName());
		
		
			obj.setPassword(1234567);
			 System.out.println(obj.getUserName());
			
			
			
				 


}
	}}
