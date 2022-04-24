package com.Interfaces.StaticAndDefaultMethods;

interface Employee{
	//abstract method
	Employee find(int id);
	
	//default method -> Concrete bodies provided in interfaces itself
	default boolean isExec(int id) {
		
		return true;
	}//->Instance methods
	
	//Static method
	static String getDefaultCountry() {
		return "India";
	}//->Class associated methods
}

public class DefaultStaticMethods {

	public static void main(String[] args) {
		
		class EmployeeImpl implements Employee{

			@Override
			public Employee find(int id) {
				boolean executive = isExec(id);
				return null;
			}
			
		}
	}
}
