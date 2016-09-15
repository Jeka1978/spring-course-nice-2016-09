package screenSaver;

import org.springframework.context.annotation.Configuration;

import java.awt.*;

/**
 * Created by Jeka on 15/09/2016.
 */
@Configuration
public class TestConfig extends ScreenSaverConfig {
    @Override
    public Color color() {
        return Color.RED;
    }
}
