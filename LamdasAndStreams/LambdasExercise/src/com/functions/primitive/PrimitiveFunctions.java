package com.functions.primitive;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PrimitiveFunctions {

	Predicate<Integer> evenNumberPredicate = x->x%2==0;
	
	IntPredicate evenNumbersPredicate2 = x->x%2==0; //This function is when we are working with primitive integers
	private void testPredicate(int i) {
		evenNumberPredicate.test(i);
	}
	//DoublePredicate
	DoublePredicate doublePredicate = x->x>10;
	//LongPredicate
	LongPredicate longPredicate = x->x>10;
	
	
	//Consumer
	IntConsumer intConsumer = null;
	DoubleConsumer doubleConsumer = null;
	LongConsumer longConsumer = null;
	
	
	//
	public static void main(String[] args) {
		
		int evenNum=20;
		new PrimitiveFunctions().testPredicate(evenNum);//Passing primitive int data even though compiler implicitly converts 
		//but it will be slow so better to use IntPredicate special function which is specially designed for primitive int data types
	}
}
