package controller;

import model.GameBoard;
import model.PongConstants;
import view.PongView;

public class PongController {

  private final PongView view;
  private final GameBoard board;

  public PongController(PongView view, GameBoard board)  {
    this.view = view;
    this.board = board;
    view.setKeyListener(new PongKeyListener(board));
  }

  public void start() throws InterruptedException {
    while (true) {
      Thread.sleep(1000 / PongConstants.TICKS_PER_SECOND);
      board.onTick();
      view.refresh();
    }
  }
}
