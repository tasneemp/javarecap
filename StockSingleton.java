package lti.stock;

public class StockSingleton {

	Stock s;
	private static StockSingleton singleton=null;
	private StockSingleton(){
	}
	
	public static StockSingleton getInstance(){
		if(singleton==null)
		{
			singleton=new StockSingleton();
			singleton.s=new Stock();
		}
		return singleton;
	}
	
	public double getQuote()
	{
		return s.getQuote();
	}
	
	public void setQuote(double q)
	{
		s.setQuote(q);
	}
	
	public void viewQuote()
	{
		s.viewQuote();
	}
	

	
	
	
	
}
