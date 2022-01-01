package model.racket;

import model.Ball;
import model.GamePiece;
import model.PongConstants;

public class PlayerRacket extends AbstractRacket {
  private final int speed;
  private int direction;

  public PlayerRacket() {
    super(PongConstants.GAME_BOARD_WIDTH - (PongConstants.RACKET_PADDING + PongConstants.RACKET_DEPTH / 2));
    this.speed = PongConstants.RACKET_SPEED_PER_TICK;
    this.direction = 0;
  }

  public void setDirection(int direction) {
    // positive, negative, 0
    this.direction = direction;
  }



  public void onTick() {
    this.y = heightToStayOnScreen(this.y + direction * speed);
  }
}
