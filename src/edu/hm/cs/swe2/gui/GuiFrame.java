/**
 * 
 */
package edu.hm.cs.swe2.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import edu.hm.cs.swe2.questions.Answer;
import edu.hm.cs.swe2.questions.Question;
import edu.hm.cs.swe2.questions.Questionnaire;
import edu.hm.cs.swe2.questions.exceptions.MissingQuestionsInQuestionnaireException;

/**
 * @author Ludwig Kotaljon
 *
 */
public class GuiFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Questionnaire questionnaire;
	private int numberQuestion = 0;
	private int[] priceMoneys;
	
	public GuiFrame(Questionnaire questionnaire, int[] priceMoneys) {
		this.questionnaire = questionnaire;
		this.priceMoneys = priceMoneys;
		setFrameUp(this);
		
		
	}
	
	private void setFrameUp(JFrame frame) {
		AnswerPanel aPanel = new AnswerPanel();
		QuestionAnswerPanel qaPanel =new QuestionAnswerPanel();
		MoneyPanel mPanel = new MoneyPanel(); 
		MoneyQuestionAnswerPanel mqaPanel = new MoneyQuestionAnswerPanel();
		try {
			fillAnswerPanel(questionnaire.getQuestion(numberQuestion).getAnswers(), aPanel, frame);
			fillQuestionAnswerPanel(questionnaire.getQuestion(numberQuestion), qaPanel, aPanel);
			fillMoneyPanel(priceMoneys, mPanel);
			fillMoneyQuestionAnswerPanel(mPanel,qaPanel, mqaPanel);
		} catch (MissingQuestionsInQuestionnaireException e1) {
			e1.getMessage();
			e1.printStackTrace();
		}
		frame.add(mqaPanel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Question: " + (numberQuestion + 1));
		frame.pack();
		frame.setVisible(true);
	}
	
	private void fillAnswerPanel(HashMap<Character, Answer> answers, AnswerPanel aPanel, JFrame frame) {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() instanceof JButton) {
					String buttonText = ((JButton) e.getSource()).getText();
					//Checks if the answer from clicked button is false
					if (!answers.get(buttonText.charAt(0)).isResult()) {
						System.out.println("Falsche Antwort");
//						javax.swing.JOptionPane.showMessageDialog(this, "Sie haben sich leider für die falsche Antwort entschiende."
//								+ "Sie haben verloren!!!");
//						this.setVisible(false);
						System.exit(0);				
					}
					
					System.out.println("Korrekte Antwort");
					//When Player has answered 15ten Question correct he wins
					if(numberQuestion < 15) {
						numberQuestion++;
						frame.setVisible(false);
						setFrameUp(new JFrame());
					}
					else {
						System.out.println("You won 1 Mio");
					}
				}
			}
		};
		JButton[] buttonArray = new JButton[4];
		int i = 0;
		for (Character answerKey : answers.keySet()) {
			buttonArray[i] = new JButton(answerKey + ": " + answers.get(answerKey).getAnswer());
			buttonArray[i].addActionListener(listener);
			aPanel.add(buttonArray[i]);
			i++;
		}
	}
	
	private void fillQuestionAnswerPanel(Question question, QuestionAnswerPanel qaPanel, AnswerPanel aPanel) {
		qaPanel.add(new JLabel(question.getQuestion(), SwingConstants.CENTER));
		qaPanel.add(aPanel);
	}
	
	private void fillMoneyPanel(int [] priceMoneys, MoneyPanel mPanel) {
		mPanel.getMinimumSize();
		for(int i = priceMoneys.length - 1; i >= 0; i--) {
			mPanel.add(new JLabel(Integer.toString(priceMoneys[i]), SwingConstants.CENTER));
		}
		mPanel.getMinimumSize();
	}
	
	private void fillMoneyQuestionAnswerPanel(MoneyPanel mPanel, QuestionAnswerPanel qaPanel, MoneyQuestionAnswerPanel mqaPanel) {
		mqaPanel.add(mPanel);
		mqaPanel.add(qaPanel);
	}
	
	
}
