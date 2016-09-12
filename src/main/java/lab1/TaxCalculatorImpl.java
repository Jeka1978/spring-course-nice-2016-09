package lab1;

import lombok.Setter;

import javax.annotation.PreDestroy;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
public class TaxCalculatorImpl implements TaxCalculator {
    private MaamSupplier maamSupplier;

    @Override
    public double withMaam(double price) {
        return price+price*maamSupplier.getMaam();
    }
}
