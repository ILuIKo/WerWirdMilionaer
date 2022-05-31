/**
 * 
 */
package edu.hm.cs.swe2.questions.exceptions;

/**
 * @author Ludwig Kotaljon
 *	Exception for a illegal number of answers
 */
public class IllegalNumberAnswersException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalNumberAnswersException() {
		super("The number of answers for the question isn't correct. Only 4 answers possible!");
	}
	
}
