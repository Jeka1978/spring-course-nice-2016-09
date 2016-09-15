package screenSaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Jeka on 15/09/2016.
 */
@Configuration
@ComponentScan(basePackages = "screenSaver")
public class ScreenSaverConfig {
    private Random random = new Random();

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
