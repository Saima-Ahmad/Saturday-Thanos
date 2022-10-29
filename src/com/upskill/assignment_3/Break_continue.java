package com.upskill.assignment_3;

public class Break_continue {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i+" ");
		}
		
		for(i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i+" ");
		}
	}

}
