// Michelle Joseph 
//Assignment 9.7 part 2

package chpt9;

public class TestAccount {

	public static void main(String[] args) {
		// test account
		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		describeAccount(account);
	}

	public static void describeAccount(Account account) {
		String accountBalance = String.format("%,.2f", account.getBalance());
		String monthlyInterest = String.format("%.2f", account.getMonthlyInterest());
		System.out.println("The balance on this account is $" + accountBalance);
		System.out.println("The monthly interest on this account is " + monthlyInterest + "%");
		System.out.println("This account was created on " + account.getDateCreated());
	}
}
