/**
 * 
 */
package edu.hm.cs.swe2.questions;

import java.util.HashMap;

import edu.hm.cs.swe2.questions.exceptions.IllegalNumberAnswersException;
import edu.hm.cs.swe2.questions.exceptions.IllegalNumberCorrectAnswerException;

/**
 * Represents a question with there answers
 * @author Ludwig Kotaljon
 *
 */
public class Question {
	private String question;
	private HashMap<Character, Answer> answers;
	
	
	
	/**
	 * @param question
	 * @throws IllegalNumberAnswersException 
	 * @throws IllegalNumberCorrectAnswerException 
	 */
	public Question(String question, Answer[] answers) throws IllegalNumberAnswersException, IllegalNumberCorrectAnswerException{
		super();
		this.answers = new HashMap<Character, Answer>();
		
		this.question = question;
		if(answers.length != 4) {
			throw new IllegalNumberAnswersException();
		}
		if(!checkCorrectNumberOfAnswers(answers)) {
			throw new IllegalNumberCorrectAnswerException();
		}
		for(int i = 0; i < answers.length; i++) {
			this.answers.put((char) (65 + i), answers[i]);
		}
	}
	/**
	 * @param question
	 * @param answers
	 * @throws IllegalNumberAnswersException 
	 * @throws IllegalNumberCorrectAnswerException 
	 */
	public Question(String question, HashMap<Character, Answer> answers) throws IllegalNumberAnswersException, IllegalNumberCorrectAnswerException {
		super();
		if(answers.size() != 4) {
			throw new IllegalNumberAnswersException();
		}
		if(!checkCorrectNumberOfAnswers((Answer[]) answers.values().toArray())) {
			throw new IllegalNumberCorrectAnswerException();
		}
		this.question = question;
		this.answers = answers;
	}
	
	private boolean checkCorrectNumberOfAnswers(Answer[] answers) {
		boolean isCorrectNumberOfAnswers = false;
		for(Answer answer : answers) {
			if(answer.isResult()) {
				isCorrectNumberOfAnswers = !isCorrectNumberOfAnswers;
			}
		}
		return isCorrectNumberOfAnswers;
	}
	/**
	 * @param question
	 * @throws IllegalNumberCorrectAnswerException 
	 */
	public Question(String question, Answer answer1, Answer answer2, Answer answer3, Answer answer4) throws IllegalNumberCorrectAnswerException {
		super();
		this.answers = new HashMap<Character, Answer>();
		this.question = question;
		
		if(!checkCorrectNumberOfAnswers(new Answer[] {answer1, answer2, answer3, answer4})) {
			throw new IllegalNumberCorrectAnswerException();
		}
		answers.put('A', answer1);
		answers.put('B', answer2);
		answers.put('C', answer3);
		answers.put('D', answer4);
		
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answers
	 */
	public HashMap<Character, Answer> getAnswers() {
		return answers;
	}
	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(HashMap<Character, Answer> answers) {
		this.answers = answers;
	}
	
	
}
