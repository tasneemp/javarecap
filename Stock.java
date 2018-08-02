package lti.stock;

public class Stock {
	private double quote;
	
	public Stock() {
	}
	
	public Stock(double quote) {
		this.quote = quote;
	}

	public double getQuote() {
		return quote;
	}

	public void setQuote(double quote) {
		this.quote = quote;
	}
	
	public void viewQuote(){
		System.out.println("The quote is "+quote);
	}
	
}
