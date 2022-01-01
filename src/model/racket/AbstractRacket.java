package model.racket;

import model.GamePiece;
import model.PongConstants;

public class AbstractRacket extends GamePiece {

  public AbstractRacket(int x) {
    super(x, PongConstants.GAME_BOARD_HEIGHT / 2);
  }

  protected int heightToStayOnScreen(int requestedHeight) {
    return Math.min(requestedHeight, PongConstants.GAME_BOARD_HEIGHT - PongConstants.RACKET_HEIGHT);
  }
}
