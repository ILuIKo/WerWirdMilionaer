/**
 * 
 */
package edu.hm.cs.swe2.questions.exceptions;

/**
 * @author Ludwig Kotaljon
 *
 */
public class MissingQuestionsInQuestionnaireException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingQuestionsInQuestionnaireException() {
		super("The Questionnaire is missing some questions. You can't start the game");
	}
}
