package exercise1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AccountTest {

	public static void main(String[] args) throws InterruptedException {


		// Initial Balance in the Account
		int initialBalanceAmount = 4500;
		
		System.out.println("------------- Account Transactions---------------" + "\n");
		System.out.println("Initial balance in the account:" + initialBalanceAmount + "\n");

		// Account object
		Account account = new Account(initialBalanceAmount);
		
		
		// Transactions ArrayList
		ArrayList<Transaction> listOfTransactions = new ArrayList<Transaction>();

		// Transactions in account
		
		Transaction firstTransaction = new Transaction(account, 500, true);
		Transaction secondTransaction = new Transaction(account, 60, false);
		Transaction thirdTransaction = new Transaction(account, 500, true);


		// transactions added to the list

		listOfTransactions.add(firstTransaction);
		listOfTransactions.add(secondTransaction);
		listOfTransactions.add(thirdTransaction);

		
		// ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// transaction loop
		listOfTransactions.forEach((n) -> executorService.execute(n));

		// shut down ExecutorService
		executorService.shutdown();

		try {

			boolean transactionComplete = executorService.awaitTermination(40, TimeUnit.SECONDS);
			if (transactionComplete) {

				System.out.println("Final " + account.toString());

			} else {

				System.out.println("Time up");

			}

		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
	}
}
