package com.streams.commonoperations;

import java.util.List;

import com.LamdasAndStreams.domain.Trade;
import com.streams.basics.TradeUtil;

public class Collecting {

	List<Trade> trades = TradeUtil.createTrades();
	
	public void collectIntoAlist() {
		
	}
	
	public void collectIntoASet() {
			
	}
	public void collectIntoAMap() {
		
	}
	
	public static void main(String[] args) {
		new Collecting().collectIntoAlist();
		new Collecting().collectIntoASet();
		new Collecting().collectIntoAMap();
	}
}
