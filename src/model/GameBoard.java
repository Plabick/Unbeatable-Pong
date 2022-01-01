package model;

import model.racket.ComputerRacket;
import model.racket.PlayerRacket;

public class GameBoard {
  private final PlayerRacket playerRacket;
  private final ComputerRacket computerRacket;
  private final Ball ball;
  private int computerScore; 
  private final int userScore = 0; 

  public GameBoard() {
    this.playerRacket = new PlayerRacket();
    this.computerRacket = new ComputerRacket();
    this.ball = new Ball();
    this.computerScore = 0;
  }

  public void onTick() {
    this.ball.onTick();
    this.playerRacket.onTick();
    this.computerRacket.onTick(ball.y, ball.xVelocity);
    if (this.ball.getX() > PongConstants.GAME_BOARD_WIDTH) {
      this.computerScore ++;
      ball.serve();
    }
    if (checkBallCollideWithPlayerRacket() || checkBallCollideWithComputerRacket()) {
      ball.bounceOffPaddle();
    }
  }

  public boolean checkBallCollideWithPlayerRacket() {
    boolean withinX =
        ball.getX() + PongConstants.BALL_DIAMETER >= PongConstants.GAME_BOARD_WIDTH;
    boolean withinY =
        ball.getY() >= playerRacket.getY() - PongConstants.RACKET_HEIGHT / 2
            && ball.getY() <= playerRacket.getY() + PongConstants.RACKET_HEIGHT / 2;
    return withinX && withinY;
  }

  public boolean checkBallCollideWithComputerRacket() {
    return ball.x - (PongConstants.BALL_DIAMETER / 2) <= PongConstants.RACKET_DEPTH / 2;
  }

  public int getPlayerRacketX() {
    return playerRacket.getX();
  }

  public int getPlayerRacketY() {
    return playerRacket.getY();
  }

  public int getComputerRacketX() {
    return computerRacket.getX();
  }

  public int getComputerRacketY() {
    return computerRacket.getY();
  }
  
  public int getComputerScore(){
    return computerScore;
  }
  
  public  int getPlayerScore(){
    return userScore;
  }

  public int getBallX() {
    return ball.getX();
  }

  public int getBallY() {
    return ball.getY();
  }

  public void setPlayerRacketDirection(int i) {
    this.playerRacket.setDirection(i);
  }

  public void serve() {
    ball.serve();
  }
}
