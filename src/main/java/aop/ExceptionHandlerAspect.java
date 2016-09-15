package aop;

import aop.business.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Jeka on 15/09/2016.
 */
@Component
@Aspect
public class ExceptionHandlerAspect {
    @Value("${dbaMails}")
    private String[] mails;

    private Map<DBException, Void> map = new WeakHashMap<>();

    @Pointcut("execution(* aop.business..*.*(..))")
    public void allBusinessMethods(){}

    @Pointcut("@annotation(Deprecated)")
    public void deprecated(){}

    @AfterThrowing(value = "allBusinessMethods()",throwing = "e")
    public void handleDBExceptions(DBException e) {
        if (!map.containsKey(e)) {
            map.put(e, null);
            for (String mail : mails) {
                System.out.println("sending to "+mail+" "+e.getMessage());
            }
        }
    }


}
