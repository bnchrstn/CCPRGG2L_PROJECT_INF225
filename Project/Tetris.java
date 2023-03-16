package game;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {
        statusbar = new JLabel("0");
        this.add(statusbar, BorderLayout.SOUTH);
        this.setTitle("Tetris");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        Board board = new Board(this);
        add(board);
        board.start();
    }

    JLabel getStatusBar() {

        return statusbar;
    }

}