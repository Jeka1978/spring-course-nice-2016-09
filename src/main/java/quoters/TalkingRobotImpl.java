package quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
       quoters.forEach(Quoter::sayQuote);
    }

}
