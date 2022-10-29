package com.upskill.java_6;

public class Singleton {
	
	// Singleton is a class that can have only one object
	// private constructor, it prevents any other instantiating
	private Singleton(){
	
	}
// private static object of the class
		
		private static Singleton SingletonObj = new Singleton();
		
		//Static instance method
		public static Singleton getInstance(){
			return SingletonObj;
		}
		
		protected static void demo(){
			System.out.println("Demo method for singletone class");
		}
	}

