/**
 * 
 */
package edu.hm.cs.swe2.pricemoneys.exceptions;

/**
 * @author Ludwig Kotaljon
 *
 */
public class MissingPriceMoneyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MissingPriceMoneyException() {
		super("Not all or to much priceranges are entered. There are only 15 price ranges");
	}

}
