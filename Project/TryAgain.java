package game;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TryAgain extends JFrame{
        TryAgain() {

            JLabel text = new JLabel("Game Over!" );
            text.setFont(new Font("DialogInput", Font.BOLD, 28));
            text.setForeground(Color.black);

            JButton tryAgainButton = new JButton();
            JButton exitButton = new JButton();

            // try again button
            tryAgainButton.setText("Retry");
            tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
                
            // exit button 
            exitButton.setText("Exit");
            exitButton.setFont(new Font("Arial", Font.BOLD, 25));
            
            // adds event to try again button 
            tryAgainHandler handler = new tryAgainHandler();
            tryAgainButton.addActionListener(handler);
                

            this.setLayout(new FlowLayout());

            // adds event to exit button 
            ExitHandler handlers = new ExitHandler();
            exitButton.addActionListener(handlers);
                    
        
            this.setLayout(new FlowLayout());

            this.add(text);
            this.add(tryAgainButton);
            this.add(exitButton);

            this.setLayout(new FlowLayout());
            this.setTitle("TETRIS");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
            this.setSize(220,140);           
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.blue);

        }
        

    private class tryAgainHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            // goes back to the main menu if try again
            new MainMenu();
            
            // closes the TryAgain frame
            dispose();
        }
    }
    private class ExitHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){ 

            // stops the program once exit is executed 
            dispose();
        }
    }



}