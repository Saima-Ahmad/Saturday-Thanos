package com.upskill.assignment_3;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter your number");
		Scanner s= new Scanner(System.in);
		number=s.nextInt();
		
		
		
	
		if( number%2==0)
		{
			System.out.println(number +" is even number");
	}
		else
		{
			System.out.println(number+" is not an even number");
		}
	}}
