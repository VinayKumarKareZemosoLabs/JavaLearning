package com.functions.bipredicate;
import java.util.function.BiPredicate;

import com.functions.predicate.Employee;


public class BiPredicateFunctions {

//	@FunctionalInterface
//	public interface BiPredicate<T,U>{
//		boolean test(T t, U u);
//		//other static and default methods
//	}
	
	
	BiPredicate<Employee, Manager> empManagerPredicate=
			(emp, manager)->emp.getManager().equals(manager)?true:false;
	
	
	private void testBiPredicate(Employee emp, Manager manager) {
		boolean isManager = empManagerPredicate.test(emp, manager);
		System.out.println("Is manager? "+isManager);
	}
	
	
	
	public static void main(String[] args) {
		Employee emp = new Employee(99);
		
		Manager manager = new Manager();
		
		emp.setManager(manager);
		
		
		new BiPredicatefuction().testPredicate(emp, manager);
		
		
		Manager manager2 = new Manager();
		
	}
	
}
