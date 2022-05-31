/**
 * 
 */
package edu.hm.cs.swe2.questions.exceptions;

/**
 * @author Ludwig Kotaljon
 *
 */
public class FullQuestionnaireException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FullQuestionnaireException() {
		super("The questionnaire is full. You can't add another question.");
	}
}
