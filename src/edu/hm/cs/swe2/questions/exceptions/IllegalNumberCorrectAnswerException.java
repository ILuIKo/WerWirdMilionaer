/**
 * 
 */
package edu.hm.cs.swe2.questions.exceptions;

/**
 * @author Ludwig Kotaljon
 * Exception because there is not the right number of correct answers for the question
 *
 */
public class IllegalNumberCorrectAnswerException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalNumberCorrectAnswerException() {
		super("There is not the right number ofcorrect answers by the 4 answers.");
	}

}
