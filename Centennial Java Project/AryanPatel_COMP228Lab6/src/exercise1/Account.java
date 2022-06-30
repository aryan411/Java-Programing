package exercise1;

public class Account extends Thread {
	
	// Balance in account
	private double balanceAmount;

	// Constructor
	public Account(double initialDepositAmount) {

		balanceAmount = initialDepositAmount;
	}

	public synchronized double getBalance() {

		return balanceAmount;
	}

	// synchronized function to deposit amount in a/c
	public synchronized void deposit(double amountdeposited) {

		try {
			Thread.sleep(1000);
			balanceAmount += amountdeposited;

		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		System.out.printf("%s deposited %.2f in the account.\n", Thread.currentThread().getName(), amountdeposited);

		System.out.println(toString() + "\n");
	}

	// synchronized function to withdraw amount from a/c
	public synchronized void withdraw(double amountwithdrawn) {

		try {
			Thread.sleep(1000);
			if (balanceAmount >= amountwithdrawn) {
				balanceAmount -= amountwithdrawn;
			}

		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		System.out.printf("%s withdrawn %.2f from the account.\n", Thread.currentThread().getName(), amountwithdrawn);

		System.out.println(toString() + "\n");

	}

	@Override
	public String toString() {
		return "Account Balance is:" + balanceAmount;
	}
}
