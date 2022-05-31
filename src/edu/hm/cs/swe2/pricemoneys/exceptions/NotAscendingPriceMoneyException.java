/**
 * 
 */
package edu.hm.cs.swe2.pricemoneys.exceptions;

/**
 * @author Ludwig Kotaljon
 *
 */
public class NotAscendingPriceMoneyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotAscendingPriceMoneyException(int currentPriceMoney, int nextPriceMoney) {
		super("The price money isn't ascending. The currrent pricemoney: " + currentPriceMoney
				+ " is higher or the same than the next price money: " + nextPriceMoney);
	}
}
