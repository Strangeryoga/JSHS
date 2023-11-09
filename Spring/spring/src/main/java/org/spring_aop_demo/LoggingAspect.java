package org.spring_aop_demo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* org.spring_aop_demo.LoggingAspect.checkout())")
	public void logger() {
		System.out.println("Loggers");
	}

}
