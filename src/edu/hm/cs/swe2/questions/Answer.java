/**
 * 
 */
package edu.hm.cs.swe2.questions;

/**
 * Represents one answer of a question
 * @author Ludwig Kotaljon
 *
 */
public class Answer {
	private boolean result;
	private String answer;
	
		
	/**
	 * Constructor
	 * @param result
	 * @param answer
	 */
	public Answer(String answer, boolean result) {
		super();
		this.result = result;
		this.answer = answer;
	}
	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
