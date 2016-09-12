package lab1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 12/09/2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:lab1-context.xml")
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class TaxCalculatorIIntegrationTest {
    @Autowired
    private TaxCalculator taxCalculator;

    @Test
    public void withMaam() throws Exception {
        double withMaam = taxCalculator.withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }

}