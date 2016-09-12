package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
@Component
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min = 3 , max = 7)
    private int repeat;


    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
