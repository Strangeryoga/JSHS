package com.stranger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.stranger.ShoppingCart.checkout(..))")
    public void beforeloggers(JoinPoint jp) {
//        System.out.println(jp.getSignature());   // void com.stranger.ShoppingCart.checkout(String)
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Arguments: " + arg);
    }

    @After("execution(* com.stranger.ShoppingCart.checkout(..))")
    public void afterloggers() {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* com.stranger.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "rv")
    public void afterReturning(String rv) {
        System.out.println("After Returning : "+ rv);
    }
}
