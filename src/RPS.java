import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RPS {
	
	int userInput;
	
	private JFrame frame;
	private JTextField gameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPS window = new RPS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RPS() {
		initialize();
	}
	
	public void RPSMethod() {
		int compInput = (int)(Math.random() * 3) + 1;
		
		//If player chose Rock
		if(userInput == 1 && compInput == 2){
			gameText.setText("Player Wins!");
		} else if(userInput == 1 && compInput == 3) {
			gameText.setText("Computer Wins!");
		}
		
		//If player chose Paper
		if(userInput == 2 && compInput == 1){
			gameText.setText("Player Wins");
		} else if(userInput == 2 && compInput == 3) {
			gameText.setText("Computer Wins");
		}
		
		if(userInput == 3 && compInput == 1){
			gameText.setText("Player Wins!");
		} else if(userInput == 3 && compInput == 2) {
			gameText.setText("Computer Wins!");
		}
		
		if(userInput == compInput){
			gameText.setText("Tie!");
		}
	};

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRock = new JButton("Rock");
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RPS.this.userInput = 1;
				RPSMethod();
			}
		});
		btnRock.setBounds(10, 102, 103, 23);
		frame.getContentPane().add(btnRock);
		
		JButton btnPaper = new JButton("Paper");
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RPS.this.userInput = 2;
				RPSMethod();
			}
		});
		btnPaper.setBounds(10, 136, 103, 23);
		frame.getContentPane().add(btnPaper);
		
		JButton btnScissors = new JButton("Scissors");
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RPS.this.userInput = 3;
				RPSMethod();
			}
		});
		btnScissors.setBounds(10, 170, 103, 23);
		frame.getContentPane().add(btnScissors);
		
		gameText = new JTextField();
		gameText.setBounds(123, 0, 161, 261);
		frame.getContentPane().add(gameText);
		gameText.setColumns(10);
		
		gameText.setText("Rock, Paper, or Scissors?");
	}
}
