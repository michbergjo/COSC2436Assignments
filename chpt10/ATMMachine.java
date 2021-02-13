//Michelle Joseph
//10.7 part 2

package chpt10;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {
		// create an array of 10 accounts
		Account[] accounts = new Account[10];

		// set the ids and balances
		for (int i = 0; i <= accounts.length - 1; i++) {
			accounts[i] = new Account(i, 100);
		}

		// prompt the user for their id
		Scanner input = new Scanner(System.in);
		int value;
		int id;

		System.out.println("Please enter an id number: ");
		id = input.nextInt();

		// prompts user to enter valid id if invalid id is entered
		if (id < 0 || id > 9) {
			System.out.println("Please enter a valid id number");
			id = input.nextInt();
		} else {
			while (true) {
				// displays main ATM menu
				System.out.println("Main Menu: \n1 - View current balance" + "\n2 - Withdraw \n3 - Deposit \n4 - Exit");
				value = input.nextInt();
				// executes menu selections
				if (value == 1) {
					System.out.println("Your current balance is " + accounts[id].getBalance());
				}
				if (value == 2) {
					System.out.println("How much would you like to withdraw?");
					double withdrawAmount = input.nextDouble();
					accounts[id].withdraw(withdrawAmount);
				}
				if (value == 3) {
					System.out.println("How much would you like to deposit?");
					double depositAmount = input.nextDouble();
					accounts[id].deposit(depositAmount);
				} if(value ==4) {
					// prompt for a new id
					System.out.println("Please enter an id number:");
					id = input.nextInt();
				}
			}

		}
		input.close();
	}

}
