/**
 * 
 */
package edu.hm.cs.swe2.pricemoneys;

import edu.hm.cs.swe2.pricemoneys.exceptions.MissingPriceMoneyException;
import edu.hm.cs.swe2.pricemoneys.exceptions.NotAscendingPriceMoneyException;

/**
 * @author Ludwig Kotaljon
 *
 */
public class PriceMoneys {
	private int [] priceMoneys;
	
	public PriceMoneys(int[] priceMoneys) throws MissingPriceMoneyException, NotAscendingPriceMoneyException {
		if(priceMoneys.length != 15) {
			throw new MissingPriceMoneyException();
		}
		for(int i = 0; i < priceMoneys.length -1 ; i++) {
			if(priceMoneys[i] >= priceMoneys[i+1]) {
				throw new NotAscendingPriceMoneyException(priceMoneys[i], priceMoneys[i+1]);
			}
		}
		this.priceMoneys = priceMoneys;
	}

	/**
	 * @return the priceMoneys
	 */
	public int[] getPriceMoneys() {
		return priceMoneys;
	}
	
	
}
