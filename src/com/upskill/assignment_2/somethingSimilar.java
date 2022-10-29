package com.upskill.assignment_2;

public class somethingSimilar {
 static int num=29;
 static boolean flag=false;


	public static void main(String[] args) {
		
		int x=2;
	
		for ( x=2; x<=num/2; ){// condition  for non prime number
			if (num%x==0){
				 flag=true;
				break;
			}
		
if (!flag)
	System.out.println(num+"is a prime number");
else
	System.out.println(num+"is  not a prime number");
	}

}
}
