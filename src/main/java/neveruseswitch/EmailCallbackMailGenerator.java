package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        // 40 lines of code
        return "<html>don't call us we call you</html>";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
