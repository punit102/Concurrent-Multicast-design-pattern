package edu.umb.cs.cs681;

import java.util.EventObject;

public class BondEvent extends EventObject {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5838852438278881371L;
	private String ticker;
	private float quote;
		
	public BondEvent(Object source,String t, float q ) {
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
