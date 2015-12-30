package cn.fengyu.frame.demo.a5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
@Order(1)
@Component
@Aspect
public class ValidateAspect {

    @Before("execution( public int cn.fengyu.frame.demo.a5.ArithmeticCalculator.*(int,int))")
    public void validateArgs(JoinPoint joinPoint) {

        System.out.println("validateArgs:" + Arrays.asList(joinPoint.getArgs()));
    }

}
