package com.upskill.assignment_1;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
	
	int password;
	System.out.print("Enter your password :");
		Scanner obj=new Scanner(System.in);
		
		password=obj.nextInt();
	
if(password==12345){     // only "if" use single condition
	
	System.out.println("Name: SAIMA");
	System.out.println("AGE: 19");
	System.out.println("Contact:718-868-9898");
}
	 else{
		 System.out.println("Sorry wrong password:");
		 
	 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


