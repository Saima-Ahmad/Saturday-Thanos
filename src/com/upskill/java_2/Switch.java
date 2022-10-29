package com.upskill.java_2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		System.out.print("Enter any two numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice: ");
		int ch = s.nextInt();
		switch(ch)
		{
		case 1: c=a+b;
		System.out.println("Addition " + c);
		break;
		case 2: c=a-b;
		System.out.println("Subtraction " + c);
		break;
		case 3 : c=a*b;
		System.out.println("Multiplication " + c);
		break;
		case 4 : c=a/b;
		System.out.println("Division " + c);
		break;
		default: System.out.println("Invalid Choic:");
		}
		
	}

}
