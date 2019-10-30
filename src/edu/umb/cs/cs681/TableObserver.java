package edu.umb.cs.cs681;

public class TableObserver implements StockEvObserver, BondEvObserver {

	@Override
	public void updateStock(StockEvent se) {

		((StockEvent) se).getTicker();
		((StockEvent) se).getQuote();
		System.out.println("TableObserver Stock Ticker: "+((StockEvent) se).getTicker()+" and Stock Quote: "+((StockEvent) se).getQuote());
	}

	@Override
	public void updateBond(BondEvent be) {
		
		((BondEvent) be).getTicker();
		((BondEvent) be).getQuote();
		System.out.println("TableObserver Bond Ticker: "+((BondEvent) be).getTicker()+" and Bond Quote: "+((BondEvent) be).getQuote());
		
	}

}
