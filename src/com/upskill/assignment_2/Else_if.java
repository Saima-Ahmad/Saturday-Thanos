package com.upskill.assignment_2;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
	int marks;
	System.out.print("Enter your Marks");
	Scanner obj=new Scanner(System.in); 
	marks=obj.nextInt();
	
if(marks>=60 && marks<=100)
{
System.out.println("First Division");	
}
else if( marks>=45 && marks<=60)
{ 
	System.out.println("Second Division");
}
		
else
{
	System.out.println("Third Division");
}


}}