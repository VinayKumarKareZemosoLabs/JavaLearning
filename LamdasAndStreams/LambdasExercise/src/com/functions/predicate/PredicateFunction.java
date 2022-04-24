package com.functions.predicate;

import java.util.function.Predicate;

public class PredicateFunction {

//	@FunctionalInterface
//	public interface Predicate<T>{
//		//Single abstract class
//		boolean test(T t);
//		
//	} //Predicate is used to check any given boolean value expression
	
	Predicate<Employee> bonusLambda = (emp)->emp.getRating()>10?true:false;
	
//	Predicate<Employee> execLambda = emp->emp.getId().startsWith();
	
	
	public static void main(String[] args) {
		
	}
	
}
