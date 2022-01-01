package model;

import model.racket.ComputerRacket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerRacketTest {
  ComputerRacket r;

  @BeforeEach
  void setUp() {
    r = new ComputerRacket();
  }

  @Test
  public void testConstructorInitialFields() {
    assertEquals(5, r.x);
    assertEquals(150, r.y);
  }

  @Test
  public void onTickComingToComputer() {
    r.onTick(10, -10);
    assertEquals(5, r.x);
    assertEquals(10, r.y);
  }

  @Test
  public void onTickAwayFromComputer() {
    r.onTick(20, 10);
    assertEquals(5, r.x);
    assertEquals(150, r.y);
  }
}
