package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
	//Array store multiple data using index
	
	int age=30;
	int[]ageThanos=new int[]{30,35,27,22,40,32};
	// array index          [0] [1] [2] [3] [4] [5]
	System.out.println("Student Age" + ageThanos[3]);
	System.out.println("Total Student" + ageThanos.length);
	 String departmentName= "hr Department";
	 String[] deparmentName=new String[]{"copy write","editors","developers"};
	 // array index               [0] [1] [2] [3]
	// System.out.println(("new hire")+ "are"+ departmentName[2]);
	 
	 //multiple dimensional array
	 int[][]ageThanos2D={{30,35,27,22,40,32},    //[0][0] [0][1] [0][3 ][0][4 ][0][5]
			 {37,26,24,35}};                 //[1][0] [1][1] [1][2] [1][3] [1][4] [1][5]
	// System.out.println("Student Age 2D " :+ ageThanos2D[0][4]);   
	 
	// hashmap store multiple data using key- value pair, implementation of Map Interface 
	 HashMap< String, Integer> Student= new HashMap<String,Integer>();
	 Student.put("Ava",23);
	 Student.put("Fahim",30);
	 Student.put("Pranto", 24);
	 
	 System.out.println("Student Age"+ Student.get("Ava"));
	 
	 
	 HashMap<String,String>Country=new HashMap<String,String>();
	 Country.put("USA"," Washington");
	 Country.put("Pakistan", "Islamabad");
	 Country.put("Bangladesh","Dhaka");
	 System.out.println("Capital:"+ Country.get("USA"));
	    //Hashsets store unordered collection 
	 HashSet<String> car=new HashSet<String>();
	 car.add("BMW");
	 car.add("Audi");
	 car.add("Ford");
	 
	 System.out.println("Car:"+ car);
	 
	 Hashtable<String,String> Region= new Hashtable<String,String>();
	 Region.put("BD","Asia");
	 Region.put("USA" , "North America");
	 
	 
	 }
		 


}