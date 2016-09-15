package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 12/09/2016.
 */
@Component
@QuoterType(Genre.FILM)
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages,
                            @Value("${JAVA_HOME}") String javaHome) {
        System.out.println("javaHome = " + javaHome);
        this.messages = Arrays.asList(messages);
    }

    public void sayQuote() {
       messages.forEach(System.out::println);
    }

    public void killAll() {
        System.out.println("you are terminated...");
    }
}
