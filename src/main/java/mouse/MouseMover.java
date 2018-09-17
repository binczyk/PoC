package mouse;

import java.awt.*;
import java.util.Random;
import java.util.logging.Logger;

public class MouseMover {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Logger logger = Logger.getLogger(MouseMover.class.getName());

        Robot robot = new Robot();
        Random random = new Random();
        int x;
        int y;
        //while (true) {
        x = random.nextInt(MAX_X);
        y = random.nextInt(MAX_Y);
        robot.mouseMove(x, y);
        logger.info("Pointer moved to " + x + "x" + y);
        Thread.sleep(FIVE_SECONDS);
        //        }
    }
}