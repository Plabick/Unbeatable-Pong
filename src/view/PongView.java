package view;

import model.GameBoard;
import model.PongConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class PongView extends JFrame {

  public PongView(GameBoard gameBoard) {
    PongPanel panel = new PongPanel(gameBoard);
    this.setSize(new Dimension(PongConstants.GAME_BOARD_WIDTH, PongConstants.GAME_BOARD_HEIGHT));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(panel);
    this.setVisible(true);
  }

  public void setKeyListener(KeyListener keyListener){
    this.addKeyListener(keyListener);
  }
  
  public void refresh() {
    this.repaint();
  }
}
