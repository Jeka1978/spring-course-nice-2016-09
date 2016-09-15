package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component
@Aspect
public class QuoterAspect {

    @Around("@annotation(quoters.Benchmark)")
    public Object handleBenchmarkMethods(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("*****BENCHMARK*******"+pjp.getSignature()+" is working");
        long start = System.nanoTime();
        Object retVal = null;
        try {
            retVal = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println("***********END*********");
        return retVal;
    }

    @Before("execution(* quoters..*.say*(..))")
    public void handleSayMethods(JoinPoint jp){
        System.out.print("this is quote: "+jp.getTarget().getClass().getSimpleName());
    }

}
