package com.upskill.java_2;

import java.util.Scanner;

public class nestedForLoop {

	public static void main(String[] args) 
	{
		int x;
		int i;
		System.out.print("Enter your number");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
	
	
			
			
			for (i=1; i<=10;  i++)	{
				int multiplicationTable=(int) (x *i);
				System.out.println(x+"*" + i+  "=" + multiplicationTable);
			}
			

	}

}
