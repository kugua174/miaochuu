package com.waveshare.miaochuu.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class AopTest0 {
    @Pointcut("execution(* com.waveshare.miaochuu.controller.HomeController.*(..))")
    public void checkTest00() {
    }

    @Before("checkTest00()")
    public void checkBefore(JoinPoint joinPoint) {
        log.info(joinPoint.toShortString() + "的前置方法执行了--");
        log.info(String.valueOf(joinPoint.getSignature()));
    }

    @After("checkTest00()")
    public void checkAfter(JoinPoint joinPoint) {
        log.info(joinPoint.toShortString() + "的后置方法执行了--");
    }

    @AfterReturning("checkTest00()")
    public void checkAfterReturning(JoinPoint joinPoint) {
        log.info(joinPoint.toShortString() + "的后置返回方法执行了--");
    }

    @AfterThrowing("checkTest00()")
    public void checkAfterThrowing(JoinPoint joinPoint) {
        log.info(joinPoint.toShortString() + "的后置异常方法执行了--");
    }

    @Around("checkTest00()")
    public Object checkAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.toShortString() + "的环绕方法前执行--");
        Object proceed = joinPoint.proceed();
        log.info(joinPoint.toShortString() + "的环绕方法后执行--" + "返回值是：" + proceed);
        return proceed;
    }
}
