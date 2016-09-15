package aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 15/09/2016.
 */
@Service
public class ImportantService {
    @Autowired
    private Dao dao;

    public void doWork() {
        System.out.println("working...");
        dao.save();
    }
}
