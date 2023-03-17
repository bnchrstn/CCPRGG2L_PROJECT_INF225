package game;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu() { 
        super("TETRIS");
        this.setLayout(new FlowLayout());

        // image icon 
        ImageIcon icon = new ImageIcon("tetriSS.png");
        JLabel label = new JLabel();
        label.setIcon(icon);

        // JLabels 
        JLabel text = new JLabel(" CREATED BY: " + "BEN CHRISTIAN ACEVEDA," + " CHARLES BAUTISTA, " );
        JLabel text2 = new JLabel("AARON MORALES, " + "JEREMY RAGUINI" );
        text.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        text.setForeground(Color.black);
        text2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        text2.setForeground(Color.black);
     
        // JButton
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Consolas", Font.BOLD, 25));

        // adds event to the start button 
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        this.add(label);
        this.add(button);
        this.add(text);
        this.add(text2);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(480, 435);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.cyan);

     }

     // Event handler class
     private class EventHandler implements ActionListener {

         public void actionPerformed(ActionEvent event) { 

            // Switches to PlayerMenu
            new PlayerMenu();

            // Closes MainMenu
             dispose();
         }
    }
}