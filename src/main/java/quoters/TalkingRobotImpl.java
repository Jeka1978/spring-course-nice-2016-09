package quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired(required = false)
//    @QuoterType(Genre.FILM)
    private List<Quoter> quoters = Arrays.asList((Quoter) () -> System.out.println("this is default  quote"));


    @Override
//    @PostConstruct
    @Benchmark
    public void talk() {
       quoters.forEach(Quoter::sayQuote);
        throw new RuntimeException("bdlfbasdlbfda");
    }

}
