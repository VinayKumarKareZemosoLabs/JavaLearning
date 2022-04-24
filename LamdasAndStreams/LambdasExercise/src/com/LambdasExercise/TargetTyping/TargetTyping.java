package com.LambdasExercise.TargetTyping;

public class TargetTyping {
	
	public interface Email{
		String constructEmail(String name);
	}
	
    Email email = (String name)->name +"@Vinaykumarkare.com";
	
    public String getEmail(String name, Email email) {
    	
    	return null;
    }
    
//    (String name, Email email) -> logic
	public static void main(String[] args) {
		
		
		//i->i*i
		
	}

}
