package com.obsqura.training.interfaceRBI;

public class HDFC implements RBI {
	private double amount;
	
	@Override
	public double recurringDeposit(double deposit, int duration) {
		 amount = ((deposit) + (deposit)*(interest/100)*(duration));
		 return amount;

	}
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
	    double amount1 = hdfc.recurringDeposit(10000,10);
        System.out.println("Amount :"+amount1);
	}
	

}
