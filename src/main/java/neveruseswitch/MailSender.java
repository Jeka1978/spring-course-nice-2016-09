package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jeka on 15/09/2016.
 */
@Service
@EnableScheduling
public class MailSender {

    private Map<Integer,MailGenerator> map = new HashMap<>();

    @Autowired
    public void setMap(List<MailGenerator> mailGenerators) {
        for (MailGenerator mailGenerator : mailGenerators) {
            int mailCode = mailGenerator.mailCode();
            if (map.containsKey(mailCode)) {
                throw new RuntimeException("mailcode " + mailCode + " already in use");
            }
            map.put(mailCode, mailGenerator);
        }
    }

    @Scheduled(cron = "1/2 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException("mailcode " + mailCode + " not in use");
        }
        String mail = mailGenerator.generateMail();
        send(mail);
    }

    private void send(String mail) {
        System.out.println(mail);
    }
}
