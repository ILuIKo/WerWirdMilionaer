/**
 * 
 */
package edu.hm.cs.swe2.main;




import edu.hm.cs.swe2.gui.GuiFrame;
import edu.hm.cs.swe2.pricemoneys.PriceMoneys;
import edu.hm.cs.swe2.pricemoneys.exceptions.MissingPriceMoneyException;
import edu.hm.cs.swe2.pricemoneys.exceptions.NotAscendingPriceMoneyException;
import edu.hm.cs.swe2.questions.Answer;
import edu.hm.cs.swe2.questions.Question;
import edu.hm.cs.swe2.questions.Questionnaire;
import edu.hm.cs.swe2.questions.exceptions.FullQuestionnaireException;
import edu.hm.cs.swe2.questions.exceptions.IllegalNumberAnswersException;
import edu.hm.cs.swe2.questions.exceptions.IllegalNumberCorrectAnswerException;


/**
 * @author Ludwig Kotaljon
 * Main Class
 */
public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Questionnaire questionnaire = new Questionnaire();
		try {
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
			questionnaire.addQuestion( new Question("Was dient nicht zur Verhütung?", 
					new Answer[] {new Answer("Pille", false),
					new Answer("Kondom", false),
					new Answer("Coitus interruptus", false),
					new Answer("Glücksspirale", true)
					}));
		} catch (IllegalNumberAnswersException | IllegalNumberCorrectAnswerException | FullQuestionnaireException e) {
			e.getMessage();
			e.printStackTrace();
		}
		PriceMoneys priceMoneys = null;
		try {
			priceMoneys = new PriceMoneys(new int[] {50, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 500000, 1000000});
		} catch (MissingPriceMoneyException | NotAscendingPriceMoneyException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		new GuiFrame(questionnaire, priceMoneys.getPriceMoneys());
	
	}
	
	

}
