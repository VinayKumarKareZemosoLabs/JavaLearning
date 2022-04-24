package com.streams.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.functions.composing.predicates.Trade;

//Stream API is used to process collections of objects. 
//A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.


public class StreamsBasics {
	

//	private List<Trade> findLargeTradesUsingPreJava8(List<Trade> trades){
//		List<Trade> largeTrades = new ArrayList<Trade>();
//		
//		//Logic for collecting the large trades
//		
//		for(Trade trade:trades) {
//			if(trade.getQuantity()>10000 & trade.getStatus().equals("CANCELLED")
//					&& trade.getInstrument().equals("GOOGL")) {
//				largeTrades.add(trade);
//			}
//		}
//		return  largeTrades;
//	}
//	
	//Collecting big trades using Streams
	private void findLargeTradesUsingStreams(List<Trade> trades) {
		
		List<Trade> largeTrades = trades.stream() //Converts list of elements into a sequence of elements #parallelStream() makes it to run in multi-threaded fashion
		.filter(trade ->trade.getQuantity()>1000) //filter method takes a predicate(conditional expressions)
		.collect(Collectors.toList());
		
		System.out.println("Large trades: "+largeTrades);
		
	}
	
	
	public static void main(String[] args) {
		StreamsBasics basics = new StreamsBasics();
		List<Trade> trades = TradeUtil.createTrades();
		//basics.findLargeTradesUsingPreJava8(trades);
	}
}
