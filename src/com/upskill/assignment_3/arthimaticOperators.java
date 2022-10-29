package com.upskill.assignment_3;

import java.util.Scanner;

public class arthimaticOperators {



	public static void main(String[] args) {
	
int a;
int b;
int c;
System.out.print("Enter any two numbers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("Addition " +"="+ (a+b));
System.out.println("Subtraction "+"="+ (a-b));
System.out.println("Multiplication "+"="+ (a*b));
System.out.println("Division "+"=" +(a/b));
System.out.println("Remainder "+"=" +(a%b));
	}

}
