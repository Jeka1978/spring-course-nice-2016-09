package aop.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Jeka on 15/09/2016.
 */
@Configuration
@PropertySource("classpath:mails.properties")
@EnableAspectJAutoProxy
public class Config {
}
