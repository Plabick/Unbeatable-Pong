package model;

import java.awt.*;

public interface PongConstants {
    int TICKS_PER_SECOND = 30;
    
    int GAME_BOARD_WIDTH = 500;
    int GAME_BOARD_HEIGHT = 300;
    
    int BALL_SPEED_PER_TICK = 12;
    int RACKET_SPEED_PER_TICK = 10;

    int BALL_DIAMETER = 10;
    
    int RACKET_DEPTH = 10;
    int RACKET_HEIGHT = 50;
    int RACKET_PADDING = 0;
    
    int SCORE_DISTANCE_FROM_SIDE = 30; 
    
    Color BACKGROUND_COLOR = Color.ORANGE;
    Color FOREGROUND_COLOR = Color.WHITE;
}
