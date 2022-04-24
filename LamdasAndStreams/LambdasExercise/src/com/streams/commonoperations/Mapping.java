package com.streams.commonoperations;

import java.util.List;
import java.util.stream.Stream;

import com.functions.predicate.Employee;

public class Mapping {

	List<Employee> employees = EmployeeUtil.creatEmployees();
	
	private void testMapping() {
		
		Stream<String> empStream = employees
				.stream()
				.map(Employee::getName)
				.map(String::toUpperCase);
		
		empStream.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		new Mapping().testMapping();
	}
}
