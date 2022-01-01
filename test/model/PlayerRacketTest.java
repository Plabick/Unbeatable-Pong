package model;

import model.racket.PlayerRacket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerRacketTest {
    PlayerRacket r;

    @BeforeEach
    void setUp() {
        r = new PlayerRacket();
    }

    @Test
    public void testConstructorInitialFields() {
        assertEquals(495, r.x);
        assertEquals(150, r.y);
    }

    @Test
    public void onTickNoDirection() {
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(150, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(150, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(150, r.y);
    }

    @Test
    public void onTickPositiveDirection() {
        r.setDirection(1);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(160, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(170, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(180, r.y);
    }

    @Test
    public void onTickNegativeDirection() {
        r.setDirection(-1);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(140, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(130, r.y);
        r.onTick();
        assertEquals(495, r.x);
        assertEquals(120, r.y);
    }
    
}
