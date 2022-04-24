package com.CapturingLamdas.Lambdas;

import com.LamdasAndStreams.domain.Trade;

public class CapturingLambda {

	Trade trade = new Trade ("IBM",2000, "OPEN");
	private ITrade openAndLargeTradeLambda;
	
	public interface ITrade{
		public boolean check(Trade t);
	}
	
	public boolean isOpenTrade() {
		ITrade simpleLambda= (t)->t.isOpen()?true:false;
		return false;		
	}
	
	public boolean checkStatus(String status) {
		ITrade statusLambda = (t)->t.getStatus().equals(status)?true:false;
		return false;
	}
	
	public boolean isOpenAndBig(String status, int quantity) {
		
		//status = "";
		ITrade openAndLargeLamda = (t)->{
			return (t.getStatus().equals(status)&& t.getQuantity()>quantity)?true:false;
		};
		
		//Object openAndLargeTradeLambda;
		return openAndLargeTradeLambda.check(trade);
		
	}
	
	int count = 0;
	public void instaceVariable(int localCount) {
		for(int i=0; i<count; i++) {
			ITrade statusLambda = t ->{
				count++;
			//	localCount++;
				return t.isOpen();
			};
		}
	}
	
	public static void main(String[] args) {
		CapturingLambda cl = new CapturingLambda();
		System.out.println("is Open Trade using non- Capturing lambda: "+cl.isOpenTrade());
	}
}
