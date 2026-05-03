package flashcards;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.EventHandler;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Flashcard extends JPanel implements MouseListener {

	private boolean flipped = true; 
	JLabel frontText = new JLabel("This is the front text!");
	JLabel backText = new JLabel("This is the back text!");
	
	public Flashcard() {
		
		addMouseListener(this);
		backText.setVisible(false);
		setBorder(BorderFactory.createLineBorder(Color.red));
		setPreferredSize(new Dimension(300,200));
		setLayout(new BorderLayout());
		
		JPanel textArea = new JPanel();
		textArea.addMouseListener(this);
		
		add(textArea, BorderLayout.CENTER);
		textArea.add(frontText);
		textArea.add(backText);
		
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		flipped = !flipped;
		frontText.setVisible(flipped);
		backText.setVisible(!flipped);
		
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}

