package com.test;
//Child class
public class IndianBank extends RbiBank {

@Override
public void fixed() {
	System.out.println("Fixed amount is 50");
	
}
	@Override
		public void deposit() {
System.out.println("deposit amount is 70%");
		}
	
	public static void main (String[] args) {
		IndianBank ib = new IndianBank();
		ib.fixed();
		ib.deposit();
		}
	
	
}
