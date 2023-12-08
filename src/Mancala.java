package src;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mancala extends JFrame{
    public Mancala() {
        super("Mancala Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel
        JPanel mainPanel = new JPanel(new GridLayout(2, 7));

        // Add pits to the panel (you can customize this based on your Mancala board)
        for (int i = 0; i < 14; i++) {
            JButton pitButton = new JButton("Pit " + (i + 1));
            pitButton.addActionListener(new PitButtonListener());
            mainPanel.add(pitButton);
        }

        // Add the main panel to the frame
        getContentPane().add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new Mancala());


        Mancala mancalaGame = new Mancala();
        mancalaGame.startGame();
    }

    private class PitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Handle pit button click
            JButton clickedPit = (JButton) e.getSource();
            JOptionPane.showMessageDialog(Mancala.this, "Clicked " + clickedPit.getText());
        }
    }
    
    public void startGame(){
        System.out.println("Welcome to Mancala!");
        playGame();
    }

    private void playGame() {
        System.out.println("Game is in progress...");

    }
    

    private void playerMove(/*int startingPit, Player currentPlayer*/){
        //Hard coded logic atm
        
    }

    private boolean gameResult(/*Player currentPlayer*/){
        
        return true;
    }
}
