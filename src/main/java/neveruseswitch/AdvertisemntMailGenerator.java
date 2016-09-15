package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component
public class AdvertisemntMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "spring is the best, even better than groovy";
    }

    @Override
    public int mailCode() {
        return 4;
    }
}
