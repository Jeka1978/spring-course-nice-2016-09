package lab1;

import lombok.Setter;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
public class MaamSupplierImpl implements MaamSupplier {
    private double maam;

    @Override
    public double getMaam() {
        return maam;
    }
}
