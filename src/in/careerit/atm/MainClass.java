package in.careerit.atm;

import java.util.Scanner;

public class MainClass {
	 
	public static void main(String[] args) {
		AtmInterface ai = new AtmOperationImplement();
		int atmnumber = 12345678;
		int atmPin = 8977;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!");
		System.out.print("Enter your ATM Number : ");
		int atmNumber = sc.nextInt();
		System.out.print("Enter your PIN : ");
		int pin = sc.nextInt();
		
		if((atmnumber == atmNumber) && (atmPin == pin)){
			while(true){
				System.out.println("1. Check Balance");
				System.out.println("2. Withdraw Amount");
				System.out.println("3. Deposit Amount");
				System.out.println("4. View Transaction History");
				System.out.println("5. Exit");
				System.out.print("Choose an option : ");
				int choice = sc.nextInt();
				if(choice==1){
					ai.checkBalance();
				}else if(choice==2){
					System.out.print("Enter amount to withdraw :");
					double withdrawAmount = sc.nextDouble();
					ai.withdrawAmount(withdrawAmount);
				}else if(choice==3){
					System.out.print("Enter Amount to Deposit :");
					double depositAmount = sc.nextDouble();//5000
					ai.depositAmount(depositAmount);
				}else if(choice==4){
					ai.viewStatement();
				}else if(choice==5){
					System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!");
					System.exit(0);
				}else{
					System.out.println("Please enter correct choice");
				}	
			}
		} else{
			System.out.println("Incorrect Atm Number or Pin");
			System.exit(0);
		}
	}
}
