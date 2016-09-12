package quoters;

import lombok.Setter;

import java.util.List;

/**
 * Created by Jeka on 12/09/2016.
 */
@Setter
public class TerminatorQuoter implements Quoter {
    private List<String> messages;
    public void sayQuote() {
       messages.forEach(System.out::println);
    }
}
