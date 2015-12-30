package cn.fengyu.frame.demo.a5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**切面必须是 IOC 中的 bean: 实际添加了 @Component 注解
 * 通过添加 @Aspect 注解声明一个 bean 是一个切面!
 * Created by fengYu Administrator on 2015/12/30.
 */

/**
 * 可以使用 @Order 注解指定切面的优先级, 值越小优先级越高
 */
@Order(2)
@Aspect
@Component
public class LoggerAspect {

    /**
     * 定义一个方法, 用于声明切入点表达式. 一般地, 该方法中再不需要添入其他的代码.
     * 使用 @Pointcut 来声明切入点表达式.
     * 后面的其他通知直接使用方法名来引用当前的切入点表达式.
     *  @Before("declareJoinPointExpression()")
     */
    @Pointcut("execution( public int cn.fengyu.frame.demo.a5.ArithmeticCalculator.*(int,int))")
    public void declareJoinPointExpression() { }


    /**表示在目标方法执行之前执行 @Before 标记的方法的方法体.  @Before 里面的是切入点表达式*/
   // @Before("execution( public int cn.fengyu.frame.demo.a5.ArithmeticCalculator.*(int,int))")
    @Before("declareJoinPointExpression()")
    public void beforeLoggerMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeLoggerMethod: The method "+name+" begins With "+ Arrays.asList(args));

    }


    /** @After 表示后置通知: 在方法执行之后执行的代码.无论该方法是否出现异常 */
 //   @After("execution(* cn.fengyu.frame.demo.a5.*.*(..))")
    @After("declareJoinPointExpression()")
    public void afterLoggerMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("afterLoggerMethod: TheMethod :"+name+" ends");

    }
    /**
     * 在方法法正常结束受执行的代码
     * 返回通知是可以访问到方法的返回值的!
     */
    @AfterReturning(value = "declareJoinPointExpression()",returning = "result")
    public void afterReturn(JoinPoint joingPoint,Object result) {
        String name = joingPoint.getSignature().getName();
        System.out.println("afterReturn: The Method "+name+" end with ___"+result);
    }


}
