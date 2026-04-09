package flashcards;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Flashcard extends JPanel implements ActionListener {

	private boolean flipped = true; 
	JLabel frontText = new JLabel("This is the front text!");
	JLabel backText = new JLabel("This is the back text!");
	
	public Flashcard() {
		
		JButton flipButton = new JButton("Flip");
		flipButton.addActionListener(this);
		
		backText.setVisible(false);
		setBorder(BorderFactory.createLineBorder(Color.red));
		setPreferredSize(new Dimension(350, 190));
		setLayout(new GridLayout(0,1));
		
		add(frontText);
		add(backText);
		add(flipButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		flipped = !flipped;
		frontText.setVisible(flipped);
		backText.setVisible(!flipped);
		
	}

}

