package controller;

import model.GameBoard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongKeyListener implements KeyListener {

  GameBoard board;

  public PongKeyListener(GameBoard board) {
    this.board = board;
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // Do Nothing
    System.out.println("key typed event");

  }

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("key pressed event");
    switch (e.getKeyChar()){
      case 'w':
        board.setPlayerRacketDirection(-1);
        break;
      case 's':
        board.setPlayerRacketDirection(1);
        break;
      case 'r':
        board.serve(); 
        break;
    }
    
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyChar() == 'w' || e.getKeyChar() == 's') {
      board.setPlayerRacketDirection(0);
    }
  }
}
