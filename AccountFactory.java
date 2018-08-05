package lti.bank;

public final class AccountFactory {
	private AccountFactory() {
		
	}
	public static Bank openAccount(String type, String holder) {
		Bank act = null;
		if (type.equalsIgnoreCase("Savings"))
			act = new Savings(holder);
		else
			act = new Current(holder);
		return act;
	}

}