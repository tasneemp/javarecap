package lti.bank;

public class Savings extends Account {

	public Savings() {
		super();
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
		txns.addElement(new Transactions("OB", bal, bal));
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (bal - MIN_SAV_BAL)) {
			bal -= amount;
			txns.addElement(new Transactions("Dr", amount, bal));
		} else
			throw new BalanceException("Insufficient funds");
			//System.out.println();
	}

}