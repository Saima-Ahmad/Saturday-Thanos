package com.upskill.java_4;

public class assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			for (int i=1;i<=50;i++)
				if (i%3==0&&i%5==0){
					System.out.println("DingDong");
				}else if (i%3==0){
					System.out.println("Ding");
				}else if (i%5==0){
					System.out.println("Dong");
				}
				else
					System.out.println(i);
		}
	

	}


