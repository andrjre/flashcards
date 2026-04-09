package flashcards;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI{

	private JFrame frame;
	private JPanel panel;
	
	public GUI(){
		
		frame = new JFrame();
		
		Flashcard flashcard = new Flashcard();
		JButton addButton = new JButton("Add");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.pink);
		panel.add(flashcard);
		panel.add(addButton);
		
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flashcards");
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}

}
