package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component("3")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        // 40 lines of code
        return "<html>happy birthday</html>";
    }
}
