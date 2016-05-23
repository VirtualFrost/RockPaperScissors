import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class RPS {

    private int userInput, wins, losses, tie;
    private JFrame frmRockPaperScissors;
    private JTextField gameText;
    private JLabel wonResult;
    private JLabel lostResult;
    private JLabel tieResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RPS window = new RPS();
                    window.frmRockPaperScissors.setVisible(true);
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
            wins++;
            wonResult.setText(String.valueOf(wins));
        } else if(userInput == 1 && compInput == 3) {
            gameText.setText("Computer Wins!");
            losses++;
            lostResult.setText(String.valueOf(losses));
        }

        //If player chose Paper
        if(userInput == 2 && compInput == 1){
            gameText.setText("Player Wins!");
            wins++;
            wonResult.setText(String.valueOf(wins));
        } else if(userInput == 2 && compInput == 3) {
            gameText.setText("Computer Wins!");
            losses++;
            lostResult.setText(String.valueOf(losses));
        }

        if(userInput == 3 && compInput == 1){
            gameText.setText("Player Wins!");
            wins++;
            wonResult.setText(String.valueOf(wins));
        } else if(userInput == 3 && compInput == 2) {
            gameText.setText("Computer Wins!");
            losses++;
            lostResult.setText(String.valueOf(losses));
        }

        if(userInput == compInput){
            gameText.setText("Tie!");
            tie++;
            tieResult.setText(String.valueOf(tie));
        }
    };

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmRockPaperScissors = new JFrame();
        frmRockPaperScissors.setTitle("Rock, Paper, Scissors");
        frmRockPaperScissors.setResizable(false);
        frmRockPaperScissors.setBounds(100, 100, 300, 300);
        frmRockPaperScissors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRockPaperScissors.getContentPane().setLayout(null);

        JButton btnRock = new JButton("Rock");
        btnRock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                RPS.this.userInput = 1;
                RPSMethod();
            }
        });
        btnRock.setBounds(10, 169, 103, 23);
        frmRockPaperScissors.getContentPane().add(btnRock);

        JButton btnPaper = new JButton("Paper");
        btnPaper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                RPS.this.userInput = 2;
                RPSMethod();
            }
        });
        btnPaper.setBounds(10, 203, 103, 23);
        frmRockPaperScissors.getContentPane().add(btnPaper);

        JButton btnScissors = new JButton("Scissors");
        btnScissors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RPS.this.userInput = 3;
                RPSMethod();
            }
        });
        btnScissors.setBounds(10, 237, 103, 23);
        frmRockPaperScissors.getContentPane().add(btnScissors);

        gameText = new JTextField();
        gameText.setBounds(123, 0, 171, 271);
        frmRockPaperScissors.getContentPane().add(gameText);
        gameText.setColumns(10);

        gameText.setText("Rock, Paper, or Scissors?");

        JLabel wonLbl = new JLabel("Won:");
        wonLbl.setBounds(10, 94, 34, 14);
        frmRockPaperScissors.getContentPane().add(wonLbl);

        JLabel lostLbl = new JLabel("Lost:");
        lostLbl.setBounds(10, 144, 34, 14);
        frmRockPaperScissors.getContentPane().add(lostLbl);

        wonResult = new JLabel("");
        wonResult.setBounds(46, 94, 46, 14);
        frmRockPaperScissors.getContentPane().add(wonResult);

        lostResult = new JLabel("");
        lostResult.setBounds(46, 144, 46, 14);
        frmRockPaperScissors.getContentPane().add(lostResult);
        
        
        JLabel tieLbl = new JLabel("Tie:");
        tieLbl.setBounds(10, 119, 34, 14);
        frmRockPaperScissors.getContentPane().add(tieLbl);
        
        tieResult = new JLabel("");
        tieResult.setBounds(46, 119, 46, 14);
        frmRockPaperScissors.getContentPane().add(tieResult);
    }
}