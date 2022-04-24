package com.functions.intro;


interface Movie{
	boolean isClassic(int movieId);
}

interface Person{
	boolean isEmployee(int empId);
}

interface Hospital{
	void admit(Patient patient);
}

interface Predicate<T>{  //Generalized interface
	boolean test(T t);
}
public class WhatAreFunctions {
	
	

}
