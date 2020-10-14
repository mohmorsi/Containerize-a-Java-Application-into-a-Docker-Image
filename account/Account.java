import java.util.*;
public class Account{
	double balance = 0.0;
	
	Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double amount){
		this.balance += amount;
	}

	public static void main(String args[]){
		Account first = new Account(5000);
		Account second = new Account(10000);
		
		System.out.println("Account 1 has $"+first.getBalance()+" and Account 2 has $"+second.getBalance());
		System.out.println("Have a nice day :)");
		
	}






	
};