package edu.umb.cs.cs681;

import java.util.EventObject;

public class StockEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5138940608643975535L;
	private String ticker;
	private float quote;
		
	public StockEvent(Object source,String t, float q ) {
		super(source);
		this.ticker = t;
		this.quote = q;
	}

	public String getTicker() {
		return ticker;	
	}
	public float getQuote() {
		return quote;
	}
	
}
