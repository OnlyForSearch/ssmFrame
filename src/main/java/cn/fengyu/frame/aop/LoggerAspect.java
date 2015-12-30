package cn.fengyu.frame.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
@Order(2)
@Aspect
@Component
public class LoggerAspect {

    /**表示在目标方法执行之前执行 @Before 标记的方法的方法体.  @Before 里面的是切入点表达式*/
    @Before("execution( public int cn.fengyu.frame.demo.a5.ArithmeticCalculator.*(int,int))")
    public void beforeLoggerMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeLoggerMethod: The method "+name+" begins With "+ Arrays.asList(args));

    }


    /** @After 表示后置通知: 在方法执行之后执行的代码. */
    @After("execution(* cn.fengyu.frame.demo.a5.*.*(..))")
    public void afterLoggerMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("afterLoggerMethod: TheMethod :"+name+" ends");

    }


}
