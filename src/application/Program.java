package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int num = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		Account acc = new Account(num, name, balance, limit);
		
		System.out.println();
		
		System.out.print("Enter the amount for withdraw: ");
		double amountWithdraw = sc.nextDouble();
		
		acc.withdraw(amountWithdraw);
		
		System.out.print(acc);
		} catch(DomainException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
