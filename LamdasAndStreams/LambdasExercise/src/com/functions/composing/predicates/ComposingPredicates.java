package com.functions.composing.predicates;

import java.util.function.Predicate;

public class ComposingPredicates {

	private void testPredicates(Trade trade) {
		
		
		
	    /*LOGICAL OR*/
		Predicate<Trade> newTrade = t->t.getStatus().equals("NEW");
		Predicate<Trade> cancelledTrade = t->t.getStatus().equals("CANCEL");
		
		Predicate<Trade> newOrCancelledTrade = newTrade.or(cancelledTrade);
		
		
		
	}
	
	public static void main(String[] args) {
		ComposingPredicates test = new ComposingPredicates();
		
	}
}
