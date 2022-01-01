package view;

import model.GameBoard;
import model.PongConstants;

import javax.swing.*;
import java.awt.*;

public class PongPanel extends JPanel {
  private final GameBoard gameBoard;

  PongPanel(GameBoard gameBoard) {
    super();
    this.gameBoard = gameBoard;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(PongConstants.BACKGROUND_COLOR);
    g.setColor(PongConstants.FOREGROUND_COLOR);
    drawRacket(
        this.gameBoard.getComputerRacketX(),
        this.gameBoard.getComputerRacketY(),
        PongConstants.RACKET_DEPTH,
        PongConstants.RACKET_HEIGHT,
        g);

    drawRacket(
        this.gameBoard.getPlayerRacketX(),
        this.gameBoard.getPlayerRacketY(),
        PongConstants.RACKET_DEPTH,
        PongConstants.RACKET_HEIGHT,
        g);

    drawBall(this.gameBoard.getBallX(), this.gameBoard.getBallY(), PongConstants.BALL_DIAMETER, g);

    drawScore(this.gameBoard.getComputerScore(), PongConstants.SCORE_DISTANCE_FROM_SIDE, g);
    drawScore(
        this.gameBoard.getPlayerScore(),
        PongConstants.GAME_BOARD_WIDTH - PongConstants.SCORE_DISTANCE_FROM_SIDE,
        g);
  }

  private void drawRacket(int x, int y, int width, int height, Graphics g) {
    int centerY = y - height / 2; // (height / 2);
    int centerX = x - (width / 2);
    g.fillRect(centerX, centerY, width, height);
  }

  private void drawBall(int x, int y, int diameter, Graphics g) {
    int centerX = x - diameter / 2;
    int centerY = y - diameter / 2;
    g.fillOval(centerX, centerY, diameter, diameter);
  }

  private void drawScore(int score, int x, Graphics g) {
    String scoreString = String.valueOf(score);
    g.drawChars(scoreString.toCharArray(), 0, scoreString.length(), x, 20);
  }
}
