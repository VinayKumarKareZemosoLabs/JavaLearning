package com.LambdasAndStreams.MethodRef;


interface IMovie{
	public boolean check(int id);
}
public class MethodReferences {
  
	public void testMovieStaticMethodRef() {
		IMovie m1 = (i)->i<100?true:false;
		IMovie m2 = MethodReferences::isClassic;
	}
	
	//Instance method reference usage
	private void testmovieInstanceMethodRef() {
		MethodReferences ref = new MethodReferences();
		IMovie m1 = (i)->i>10 && i<100?true:false;
	//	IMovie m2 = ref::isTop10;
	}
	
//	private void testMovieArbiratoryObjectMethod() {
//		IMovie m1 = SomeMethodReference::isComedy();
//	}
	public static boolean isClassic(int movieId) {
		return true;
	}
	
    public static void main(String[] args) {
		MethodReferences client = new MethodReferences();
	}
	
}
