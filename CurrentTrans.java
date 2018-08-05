package lti.bank;


public class CurrentTrans extends Transactions {
	private double od;

	public CurrentTrans() {
	}

	public CurrentTrans(String type, double amount, double balance,double od) {
		super(type,amount,balance);
		this.od = od;
	}
	
	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance+"\t"+od;
	}
	
	
	

}