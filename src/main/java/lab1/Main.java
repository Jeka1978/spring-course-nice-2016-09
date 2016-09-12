package lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jeka on 12/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lab1-context.xml");
        double withMaam = context.getBean(TaxCalculator.class).withMaam(200);
        System.out.println("withMaam = " + withMaam);
    }
}
