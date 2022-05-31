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
public class MoneyPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoneyPanel() {
		this.setLayout(new GridLayout(15,1));
		this.setBackground(Color.WHITE);
	}
}
