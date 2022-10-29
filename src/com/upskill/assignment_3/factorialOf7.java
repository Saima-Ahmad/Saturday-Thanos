package com.upskill.assignment_3;
//write a java program to display factorial of 7
public class factorialOf7 {
/*Factorial of 7
 * 
 */
	public static void main(String[] args) {
		myMethod();
	}

	public static void myMethod() {
		int n=7;
		int result=1;
		for(int i=1; i<=n; i++){
			result=result*i;
			System.out.println("The Factorial of 7 is " + result);
		
	}

	}

}
