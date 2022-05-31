/**
 * 
 */
package edu.hm.cs.swe2.questions;

import edu.hm.cs.swe2.questions.exceptions.FullQuestionnaireException;
import edu.hm.cs.swe2.questions.exceptions.MissingQuestionsInQuestionnaireException;

/**
 * @author Ludwig Kotaljon
 * Represents the Question that will be ask in this round
 */
public class Questionnaire {
	private Question[] questions;
	
	public Questionnaire() {
		questions = new Question[15];
	}
	
	public void addQuestion(Question question) throws FullQuestionnaireException {
		for(int i = 0; i < questions.length; i++) {
			if(questions[i] == null) {
				questions[i] = question;
				break;
			}
			if(i == questions.length -1) {
				throw new FullQuestionnaireException();
			}
		}
	}
	
	public Question getQuestion(int indexOfQuestion) throws MissingQuestionsInQuestionnaireException {
		for(int i = 0; i < questions.length; i++) {
			if(questions[i] == null) {
				throw new MissingQuestionsInQuestionnaireException();
			}

		}
		return questions[indexOfQuestion];
	}
	
	public Question[] getQuestion() throws MissingQuestionsInQuestionnaireException {
		for(int i = 0; i < questions.length; i++) {
			if(questions[i] == null) {
				throw new MissingQuestionsInQuestionnaireException();
			}

		}
		return questions;
	}
}
