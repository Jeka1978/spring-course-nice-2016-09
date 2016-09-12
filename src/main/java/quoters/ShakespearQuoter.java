package quoters;

import lombok.Setter;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
public class ShakespearQuoter implements Quoter {
    private String message;

    @InjectRandomInt(min = 3 , max = 7)
    private int repeat;


    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
