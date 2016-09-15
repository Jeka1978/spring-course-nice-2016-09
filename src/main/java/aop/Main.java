package aop;

import aop.business.ImportantService;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

/**
 * Created by Jeka on 15/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("aop");
        try {
            context.getBean(ImportantService.class).doWork();
        } catch (Exception e) {
            System.out.println("PROBLEM");
        }try {
            context.getBean(ImportantService.class).doWork();
        } catch (Exception e) {
            System.out.println("PROBLEM");
        }
    }
}
