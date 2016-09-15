package screenSaver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 15/09/2016.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class TestConfigTest {
    @Autowired
    private Color color;
    @Test
    public void color() throws Exception {
        System.out.println(color);
    }

}