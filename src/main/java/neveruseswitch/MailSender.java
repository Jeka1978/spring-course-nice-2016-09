package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Jeka on 15/09/2016.
 */
@Service
@EnableScheduling
public class MailSender {

    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(cron = "1/2 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(DBUtils.getMailCode());
        String mail = map.get(mailCode).generateMail();
        send(mail);
    }

    private void send(String mail) {
        System.out.println(mail);
    }
}
