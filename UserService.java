package lti.account;



public class UserService {
	
	//withdraw,deposit
	
	public void deposit(Account acc,double amount) {
		acc.setBalance(acc.getBalance()+amount);
		acc.getTransaction().add(new Transaction("Cr", amount, acc.getBalance()));
	}

	public void withdraw(Account acc,double amount) {
		if (amount <= acc.getBalance()) {
			acc.setBalance(acc.getBalance() - amount);
			acc.getTransaction().add(new Transaction("Dr", amount, acc.getBalance()));
		} else
			System.out.println("Not enough funds!");
	}
}
