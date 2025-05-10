package in.careerit.atm;

import java.util.*;

public class AtmOperationImplement implements AtmInterface{
	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();

	@Override
	public void checkBalance() {
		System.out.println("Available Balance is: "+atm.getBalance());	
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0){
			if(withdrawAmount <= atm.getBalance()){
				ministmt.put(withdrawAmount," Amount Withdrawn");
				System.out.println("Collect the Cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				checkBalance();
			}else{
				System.out.println("Insufficient Balance !!");
			}
		}else{
			System.out.println("Please enter the amount in multiple of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount," Amount Deposited");
		System.out.println(depositAmount+" Deposited Successfully !");
		atm.setBalance(atm.getBalance()+depositAmount);
		checkBalance();
	}

	@Override
	public void viewStatement() {
		for(Map.Entry<Double,String>m:ministmt.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}