package game;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TryAgain extends JFrame{
        TryAgain() {

            JButton tryAgainButton = new JButton();
            JButton exitButton = new JButton();

            tryAgainButton.setText("Retry");
            tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
                

            exitButton.setText("Exit");
            exitButton.setFont(new Font("Arial", Font.BOLD, 25));

            tryAgainHandler handler = new tryAgainHandler();
            tryAgainButton.addActionListener(handler);
                

            this.setLayout(new FlowLayout());

            ExitHandler handlers = new ExitHandler();
            exitButton.addActionListener(handlers);
                    
        
            this.setLayout(new FlowLayout());

            this.add(tryAgainButton);
            this.add(exitButton);
            
            this.setLayout(new FlowLayout());
            this.setTitle("Tetris");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
            this.setSize(220,100);           
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.blue);

        }
        

    private class tryAgainHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            new MainMenu();
            dispose();
        }
    }
    private class ExitHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){ 
            dispose();
        }
    }



}