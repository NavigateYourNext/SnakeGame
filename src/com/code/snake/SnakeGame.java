package com.code.snake;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new SnakeGraphics());
               
        setResizable(false);
        pack();
        
        setTitle("A Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGame();
            ex.setVisible(true);
        });
        
       
    }
}
