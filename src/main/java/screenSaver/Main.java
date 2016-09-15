package screenSaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jeka on 15/09/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            ColorFrame colorFrame = context.getBean(ColorFrame.class);
            colorFrame.moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}
