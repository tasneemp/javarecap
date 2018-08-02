import java.util.Scanner;
import lti.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		StockSingleton ss=StockSingleton.getInstance();
		ss.viewQuote();
		
		ss.setQuote(30);
		ss.viewQuote();
		ss.getQuote();
		StockSingleton ss1=StockSingleton.getInstance();
		ss1.viewQuote();
	}
}
