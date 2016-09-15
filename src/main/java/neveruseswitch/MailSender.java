package neveruseswitch;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 15/09/2016.
 */
@Service
@EnableScheduling
public class MailSender {

    @Scheduled(cron = "1/2 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        System.out.println("working...");

        //// TODO: 15/09/2016
    }
}
