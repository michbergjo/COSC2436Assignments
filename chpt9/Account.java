// Michelle Joseph 
//Assignment 9.7 part 1

package chpt9;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//default constructor
	public Account() {
		
	}
	
	//constructor with parameters 
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//getter for monthly interest 
	public double getMonthlyInterest() {
		double monthlyInterestRate = (annualInterestRate/100)/12;
		return balance * monthlyInterestRate;
	}

	//withdraw funds from the account balance
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	//deposite funds in the account
	public void deposit(double amount) {
		balance = balance + amount; 
	}
}
