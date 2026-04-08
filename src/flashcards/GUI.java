package flashcards;
import java.awt.BorderLayout;
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
		
		JButton button = new JButton("Click");
		button.addActionListener(this);
		
		label = new JLabel("Front");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
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
