/**
 * 
 */
package edu.hm.cs.swe2.gui;

import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.JPanel;


/**
 * @author Ludwig Kotaljon
 *
 */
public class QuestionAnswerPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Costructor
	 */
	public QuestionAnswerPanel(){
        this.setLayout(new GridLayout(2,1));
		this.setBackground(Color.WHITE);		
	}
}
