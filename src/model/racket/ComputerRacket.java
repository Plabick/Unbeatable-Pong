package model.racket;

import model.PongConstants;

public class ComputerRacket extends AbstractRacket {

  public ComputerRacket() {
    super(PongConstants.RACKET_PADDING + PongConstants.RACKET_DEPTH / 2);
  }

  public void onTick(int ballY, int ballYVelocity) {
    if(ballYVelocity < 0){
      this.y = heightToStayOnScreen(ballY);
    }
  }
}
