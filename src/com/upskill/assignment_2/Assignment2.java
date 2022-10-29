package com.upskill.assignment_2;

public class Assignment2  {

	/*Grade A: Marks>=90
	/Grade B: Marks>=80-89
	/		Grade C:Marks>=70-79
	/		Grade D: Marks>=60-69
	/		Fail : Marks<=60
	*/		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	myMethod(50);
			}
	private static void myMethod(int Marks) {
		if(Marks>=90&& Marks<=100){
		System.out.println("Grade A");}
		else if (Marks>= 80 && Marks<=89){
			System.out.println("Grade B");}
		else if(Marks>=70 && Marks<=79){
		System.out.println("Grade C");}
	
		else if(Marks>=60&& Marks<=69){

			System.out.println("Grade D");}
		else if (Marks<60){
			System.out.println("Fail");}
		else{
			System.out.println("Invalid Marks");}
				
		}
	}
	
	
	
	
	
	

