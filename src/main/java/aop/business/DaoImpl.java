package aop.business;

import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 15/09/2016.
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("Saving...");
        throw new DBException("SYBASE sucks...");
    }
}
