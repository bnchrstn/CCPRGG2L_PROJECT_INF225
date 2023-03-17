package game;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

    public class ColorMenu extends JFrame {

        // color name array 
        private String[] colorNameArray = {"GRAY", "LIGHT GRAY","WHITE", "BLACK"};
        // color list array 
        private Color [] colorListArray = {Color.gray,Color.lightGray,Color.white, Color.BLACK};
        // JList 
        JList colorList;
    
            ColorMenu(){

                JLabel label = new JLabel();
                label.setText("Select Background Color");
                label.setFont(new Font("DialogInput", Font.BOLD,30));
                label.setForeground(Color.black);
                this.add(label);

                colorList = new JList(colorNameArray);
                colorList.setFont(new Font("DialogInput",Font.BOLD,30));
                colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                colorList.setForeground(Color.black);
                this.add(colorList);
        
                EventHandler handler = new EventHandler();
                colorList.addListSelectionListener(handler);

                this.setLayout(new FlowLayout());
                this.setTitle("TETRIS");
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
                this.setSize(450,280);           
                this.setLocationRelativeTo(null);
                this.setVisible(true);
                this.setResizable(false);
                this.getContentPane().setBackground(Color.cyan);
    
    }
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){

            Board.gameBGC = colorListArray[colorList.getSelectedIndex()];

            // Go to Difficulty Menu 
            new DifficultyMenu();

            // Closes ColorMenu 
            dispose();
        }
    }  
}