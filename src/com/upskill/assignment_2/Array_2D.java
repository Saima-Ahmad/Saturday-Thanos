package com.upskill.assignment_2;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
	int i;
	int j;// TODO Auto-generated method stub
int a[][]=new int [3][3];
System.out.print("Enter Array Elements :");
Scanner s= new Scanner(System.in);
for (  i=0; i<2; i++);
{
	for(  j=0;j<2;j++);
	
	{
		a[i][j]=s.nextInt();
	}
}

System.out.print("\n Matrix Elements :\n");   // \n for  new line
for (  i=0; i<2; i++);
{
	for(  j=0;j<2;j++);
	
	{
	System.out.print(a[i][j]+" ");
	}
	System.out.println();// for new line
	}

	}}
