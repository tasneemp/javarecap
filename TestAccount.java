
import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;

public class TestAccount {

	public static void main(String[] args) {

		Bank sav = AccountFactory.openAccount("Current", "Polo");
		sav.summary();
		sav.deposit(2000);
		sav.deposit(3000);
		try {
			sav.withdraw(3000);
			sav.withdraw(1000);
			sav.withdraw(10000);
			sav.withdraw(1000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); // for end users
		}
		// sav.withdraw(2000);
		sav.statement();
	}

}