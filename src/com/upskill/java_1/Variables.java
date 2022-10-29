package com.upskill.java_1;

public class Variables {
	// Variables in java
	
			// Instance OR global variable - Variables declared in Class,outside method
			
			// Static variable- variables belongs to class and don't required creating object
			
			//Local variables- variables declared in method
			
			// Method parameter- variables used as method parameter
			
	public static void main(String[] args) {
		
	String city= "NYC";
	myMethod("Queens");
	}
		
				public static void myMethod(String county){
		System.out.println( "Method Parameter:::: + county");
		
		
		String color="pink";
		myMethod("Rose");
		
		System.out.println("Method Parameter" + "is"+ "color1" );	
		}
		

	}


