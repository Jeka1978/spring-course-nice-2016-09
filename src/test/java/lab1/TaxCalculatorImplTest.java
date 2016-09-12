package lab1;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Jeka on 12/09/2016.
 */
public class TaxCalculatorImplTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        MaamSupplier maamSupplier = mock(MaamSupplier.class);
        when(maamSupplier.getMaam()).thenReturn(0.1);
        taxCalculator.setMaamSupplier(maamSupplier);
        Assert.assertEquals(110,taxCalculator.withMaam(100),0.00001);
    }

}