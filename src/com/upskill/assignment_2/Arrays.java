package com.upskill.assignment_2;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		System.out.println("Enter array elements");
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5 ;i++)
		//int a[]={10,20,30,40,50};
{
			a[i]=s.nextInt();
//for(int b:a)
//{
	//System.out.print(b+" ");
}
	Arrays.sort(a);	
	System.out.println("/n Array Elements");	
		for (int b:a)// FOR EACH LOOP FOR ARRAY
		{
			System.out.print(b+ " ");
		}
	}


		
	}


