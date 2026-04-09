package flashcards;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener{

	private boolean flipped = true; 
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI(){
		
		frame = new JFrame();
		label = new JLabel("Front");
		JPanel flashcard = Flashcard.makeFlashcard();
		
		JButton flipButton = new JButton("Flip");
		JButton addButton = new JButton("Add");
		flipButton.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
		panel.setLayout(new GridLayout());
		panel.add(flashcard);
		//panel.add(flipButton);
		//panel.add(label);
		//panel.add(addButton);
		
		panel.setBackground(Color.pink);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flashcards");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(flipped == true) {
			label.setText("Back");
			flipped = false;
		} else {
			label.setText("Front");
			flipped = true;
		}
	}

}
