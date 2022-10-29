package com.upskill.java_2;

import java.util.Scanner;

public class WhileLoop {


	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter your number");
				Scanner s= new Scanner(System.in);
				number=s.nextInt();
		while(number>=0)
		{
			if(number%2==0)
			{
		
		System.out.println("Even Number");
		}		
		else
		{
			System.out.println("Odd Number");
		}
}
	
		System.out.println("While Loop ended");
	}
}
