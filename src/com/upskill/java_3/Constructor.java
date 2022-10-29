package com.upskill.java_3;

import com.upskill.java_2.MethodType;

public class Constructor extends MethodType{
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String a;
	int b;
	private char[] c;
	
	public Constructor(String name, int age, int WeeklyIncome){
		a = name;
		b = age;
		int c = WeeklyIncome;
	}
 
	public static void main(String[] args, int c) {

		 c=4500;
		Constructor obj = new Constructor("Fahim", 30,  c);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
								
	}
  
	
	
} 
