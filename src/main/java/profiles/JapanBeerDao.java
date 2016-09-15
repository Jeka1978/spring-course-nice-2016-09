package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 15/09/2016.
 */
@Repository
@Profile("JAPAN")
//@Prod
public class JapanBeerDao implements BeerDao {
    @Override
    public Beer getBeer() {
        return Beer.builder().name("sahai").build();
    }
}
