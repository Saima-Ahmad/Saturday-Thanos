package com.upskill.assignment_3;

import java.util.Scanner;

public class Do_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter your number");
				Scanner s= new Scanner(System.in);
				number=s.nextInt();
		do
		{
			System.out.println( number);
			++number;
		}
		while(number<=10);
		
	}


}
