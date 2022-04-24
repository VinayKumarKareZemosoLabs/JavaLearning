package com.streams.commonoperations;

import java.util.List;
import java.util.stream.Stream;

import com.functions.predicate.Employee;

public class Filtering {

	List<Employee> employees = EmployeeUtil.creatEmployees();
	
//	private void testFiltering() {
//		Stream<Employee> empStream = employees
//				.stream()
//				.filter(Employee::isExecutive);
//		empStream.forEach(System.out::println);
//	}
	
	
	public static void main(String[] args) {
	//	new Filtering().testFiltering();
	}
}
