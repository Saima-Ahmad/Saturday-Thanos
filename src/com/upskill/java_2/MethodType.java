package com.upskill.java_2;



public class MethodType {
public static int hourlyIncome=65;
public static int weeklyIncome= hourlyIncome*40;
	public static void main(String[] args) {
		annualIncomeVoid();
		monthlyIncomeReturn();
		WeeklyIncomeVoid1();
		
	}
	/// static void method	
public static void WeeklyIncomeVoid1() {
		int calculateWeeklyIncome=hourlyIncome*40;
	
		int calculateAnualIncome=(weeklyIncome*48);
		System.out.println("My Weekly Income::::"+ calculateAnualIncome);
		
	}


   // Void method
	
	public static void annualIncomeVoid(){
		int calculateAnnualIncome= hourlyIncome *2000;
				System.out.println("My Annual Income :::"+ calculateAnnualIncome);
						
	} 
	
	// return type method
	
	public static int monthlyIncomeReturn(){
		int calculateMonthlyIncome=hourlyIncome*180;
		return calculateMonthlyIncome;
		


	}
	
		
	
		
		
	}
	
	


