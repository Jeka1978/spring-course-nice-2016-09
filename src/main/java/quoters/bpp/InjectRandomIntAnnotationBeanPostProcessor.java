package quoters.bpp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import quoters.InjectRandomInt;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Jeka on 12/09/2016.
 */
@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int max = annotation.max();
                int min = annotation.min();
                Random random = new Random();
                int value = min + random.nextInt(max - min);
                field.setAccessible(true);
                field.set(bean,value);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       return bean;
    }
}
