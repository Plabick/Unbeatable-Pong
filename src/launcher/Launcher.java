package launcher;

import controller.PongController;
import model.GameBoard;
import view.PongView;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        GameBoard board = new GameBoard();
        PongView view = new PongView(board);
        PongController controller = new PongController(view, board);
        controller.start();
    }
}
