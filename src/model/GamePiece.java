package model;

public abstract class GamePiece {
  protected int x;
  protected int y;

  public GamePiece(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
