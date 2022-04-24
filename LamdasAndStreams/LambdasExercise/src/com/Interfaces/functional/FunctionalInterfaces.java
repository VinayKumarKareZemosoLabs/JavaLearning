package com.Interfaces.functional;

public class FunctionalInterfaces {

	//Functional Interface
	@FunctionalInterface //Annotation to decorate Functional interface
	interface Multiplier{
		int multiply(int i, int j);
		//int square(int j);
	};
	
	//Lambda Expression
	Multiplier multiplier=(p,q)->p*q;
	public static void main(String[] args) {
		FunctionalInterfaces client = new FunctionalInterfaces();
		
	}
}
