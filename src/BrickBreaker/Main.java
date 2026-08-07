package BrickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame gameView = new JFrame();
        GamePlay gamePlay = new GamePlay();

        gameView.setBounds(10, 10, 800, 600);
        gameView.setTitle("Brick Breaker");
        gameView.setResizable(false);
        gameView.setVisible(true);
        gameView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}