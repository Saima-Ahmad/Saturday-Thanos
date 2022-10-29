package com.upskill.assignment_2;

public class Problem4 {

	public static void main(String[] args) {
	//	myMethod();
		myMethod1();
	//myMethod2();
	}
	private static void myMethod2() {
		int upperbound=100;
		for(int number=2; number<=upperbound;++number){
			int maxFactor=(int)Math.sqrt(number);
			boolean isPrime=true;
			int factor=2;
			while(isPrime && factor<=maxFactor){
				if(number% factor==0){
					isPrime=false;}
				++factor;
				}
			if (isPrime)
				System.out.println(number+"is a prime");
			}
			
			
		}
		
	

	
	private static void myMethod() {
		for (int i=1; i<=500; i=i*2){
			System.out.println("Double values:"+i);
		}	
}
		private static void myMethod1() {
			for (int i=8; i<=100; i=i*2){
				System.out.println("Double values:"+i);
	}

}
}