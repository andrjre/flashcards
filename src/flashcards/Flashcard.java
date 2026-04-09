package flashcards;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Flashcard {

	public static JPanel makeFlashcard() {
		
		JLabel frontText = new JLabel("This is the front text!");
		JLabel backText = new JLabel("This is the back text!");
		
		Border border = BorderFactory.createLineBorder(Color.red);
		
		JPanel flashcard = new JPanel();
		flashcard.add(frontText);
		flashcard.add(backText);
		flashcard.setSize(300,500);
		flashcard.setBorder(border);
		
		return flashcard;
	}

}
