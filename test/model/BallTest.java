package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {
  Ball b;

  @BeforeEach
  void setUp() {
    b = new Ball();
  }

  @Test
  public void bounceOffPaddle() {
    b.xVelocity = 1;
    b.yVelocity = 1;
    b.bounceOffPaddle();
    assertEquals(-1, b.xVelocity);
    assertEquals(1, b.yVelocity);
  }

  @Test
  public void bounceOffWall() {
    b.xVelocity = 1;
    b.yVelocity = 1;
    b.bounceOffTopOrBottom();
    assertEquals(1, b.xVelocity);
    assertEquals(-1, b.yVelocity);
  }

  @Test
  public void onTick() {
    b.xVelocity = 1;
    b.yVelocity = 1;
    b.onTick();
    assertEquals(251,b.x);
    assertEquals(151,b.y);
    b.onTick();
    assertEquals(252,b.x);
    assertEquals(152,b.y);
    b.onTick();
    assertEquals(253,b.x);
    assertEquals(153,b.y);
  }
}
