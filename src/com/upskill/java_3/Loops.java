package com.upskill.java_3;

public class Loops {
   /*
    * Type of Loops
    * 1. For Loop
    * 2. While Loop
    * 3.Do While Loop
    * 4. Infinite Loop
    */
    
	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		// practiceInfiniteLoop();
		practiceNestedForLoop();
		//practiceWhileLoop1();
		
	}
	
	public static void practiceForLoop(){
	int i;               // For Loop- Do again and again up to upper limit
	for (i= 1; i<=10;i++){         // Initialize the variable
		System.out.println("For Loops numbers=" +i);      //Setting lower limit , Upper limit, incre
		
	}
	}
	
	public static void practiceWhileLoop(){
		int i = 1;
		while(i<=100){
			System.out.println("While Loop numbers="+i);
			i++;
		}
	}
	public static void practiceDoWhileLoop(){
		int i=11;
		do{
			System.out.println("Do While number= " + i);
			i++;
		}while(i<=100);
			
	}
	public static void practiceInfiniteLoop(){
		int i;
		for (i=1;   ;i++){
	System.out.println("For Loops numbers="+i);
			
			
			

		}
	
	
		
	}
	
	public static void practiceWhileLoop1(){
		int j=8;  
		while (j<=100){
		System.out.println("practiceWhileLoop1=" +j);
		j++;

		}
		}

	public static void practiceNestedForLoop(){
	
	int j;
	int  x=(8);
	for (j=1; j<=10;  j++)	{
		int multiplicationTable=(int) (x*j);
		System.out.println("8*"+j+ "=" + multiplicationTable);
	}
	
	}

		
	}

	  
		
		
		
	


	
