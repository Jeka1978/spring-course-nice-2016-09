package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

/**
 * Created by Jeka on 15/09/2016.
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@EnableScheduling
@EnableAsync
public class JavaConfig2 {

    @Value("${M2_HOME}")
    private String m2;

    @PostConstruct
    public void init(){
        System.out.println("m2 = " + m2);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setIgnoreResourceNotFound(true);
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }
}
