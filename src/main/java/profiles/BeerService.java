package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Jeka on 15/09/2016.
 */
@Service
public class BeerService {
    @Autowired
    //spring.profiles.active=
    private BeerDao beerDao;

    @PostConstruct
    public void printBeer(){
        System.out.println(beerDao.getBeer());
    }
}
