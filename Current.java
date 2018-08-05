package lti.bank;

public class Current extends Account {

	private double od;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.od = OVERDRAFT_AMT;
		txns.addElement(new CurrentTrans("OB", bal, bal,OVERDRAFT_AMT));
	}

	public Current() {
	}

	@Override
	public void deposit(double amount) {
		od += amount;
		if (od > OVERDRAFT_AMT) {
			bal += od - OVERDRAFT_AMT;
			od = OVERDRAFT_AMT;
		}
		txns.addElement(new CurrentTrans("Cr", amount, bal,od));
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (bal + od)) {
			bal -= amount;
			if (bal < MIN_CUR_BAL) {
				od += bal;
				bal = MIN_CUR_BAL;
			}
			txns.addElement(new CurrentTrans("Dr", amount, bal,od));
		} else
			throw new BalanceException("Insufficient funds");
			//System.out.println("Insufficient funds!");
		
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + od);
	}

}