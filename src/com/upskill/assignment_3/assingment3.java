package com.upskill.assignment_3;

public class assingment3 {
//write a program to calculate percentage using marks of three subjects
	
	
	
	public static void main(String[] args) {
		Object myMethod = myMethod(); 
		 Object myMethod1=myMethod1();
		 Object myMethod2=myMethod2();
		Object myMethod3=myMethod3();
		
		float marksBiology=50;
		float marksChemistry=95;
		float marksMath =86;
	
	myMethod1=(marksBiology/100)*100;
	System.out.println("Biology:"+myMethod1);
	

	myMethod2=(marksChemistry/100)*100;
	System.out.println("Chmistry:"+myMethod2);
	
float marksMaths=86;
myMethod=(marksMaths/100)*100;
System.out.println("Math:"+myMethod);
myMethod3=(((marksBiology+marksChemistry+marksMath)/300)*100);
System.out.println("Total%:"+myMethod3);
	}	

private static Object myMethod3() {
	// TODO Auto-generated method stub
	return null;
}

private static Object myMethod() {
	// TODO Auto-generated method stub
	return null;
}

private static Object myMethod1() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object myMethod2() {
	// TODO Auto-generated method stub
	return null;
	

}
}

