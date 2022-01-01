package model;

import java.util.Random;

public class Ball extends GamePiece {
  int xVelocity;
  int yVelocity;
  Random random;

  /** Initialize a Ball in the center of the board heading to the left. */
  public Ball() {
    this(PongConstants.GAME_BOARD_WIDTH / 2, PongConstants.GAME_BOARD_HEIGHT / 2);
  }

  protected Ball(int x, int y) {
    super(x, y);
    this.random = new Random();
    this.serve();
  }

  public void serve() {
    this.x = PongConstants.GAME_BOARD_WIDTH / 2;
    this.y = PongConstants.GAME_BOARD_HEIGHT / 2;

    this.xVelocity = 2 + this.random.nextInt(PongConstants.BALL_SPEED_PER_TICK - 2);
    this.yVelocity = PongConstants.BALL_SPEED_PER_TICK - xVelocity;
  }

  public void onTick() {
    this.x += this.xVelocity;
    this.y += this.yVelocity;
    if (this.y <= PongConstants.BALL_DIAMETER / 2
        || this.y >= PongConstants.GAME_BOARD_HEIGHT - 3 * PongConstants.BALL_DIAMETER) {
      bounceOffTopOrBottom();
    }
  }

  protected void bounceOffTopOrBottom() {
    this.yVelocity *= -1;
  }

  public void bounceOffPaddle() {
        this.xVelocity *= -1;
        this.yVelocity *= -1;
  }
}
