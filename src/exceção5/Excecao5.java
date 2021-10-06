package exce��o5;

import java.util.Locale;
import java.util.Scanner;

import model.entities5.Account;
import model.exceptions2.BusinessException;

public class Excecao5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter account data ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
				
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
	
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2fn", acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
				
		sc.close();

	}

}
