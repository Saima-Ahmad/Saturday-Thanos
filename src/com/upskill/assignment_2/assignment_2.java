package com.upskill.assignment_2;

public class assignment_2 {
	//write a program to calculate percentage using marks of three subjects
		
		
		
		public static void main(String[] args) {
			Object myMethod = myMethod();
			 Object myMethod1=myMethod1();
			
			
			float marksBiology=50;
			float marksChemistry=95;
			float marksMath =86;
		
		myMethod=(marksBiology/100)*100;
		System.out.println("Biology:"+myMethod);
		

		myMethod=(marksChemistry/100)*100;
		System.out.println("Chmistry:"+myMethod);
		
	float marksMaths=86;
	myMethod=(marksMaths/100)*100;
	System.out.println("Math:"+myMethod);
	myMethod1=(((marksBiology+marksChemistry+marksMath)/300)*100);
	System.out.println("Total%:"+myMethod1);
		}	

	

	private static Object myMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object myMethod1() {
			// TODO Auto-generated method stub
			return null;
		}
}

		
