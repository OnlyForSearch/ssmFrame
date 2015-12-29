package cn.fengyu.frame.demo.a5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MainDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-aop.xml");
        ArithmeticCalculator arithmeticCalculator= (ArithmeticCalculator) context.getBean("arithmeticCalculator");
        int add = arithmeticCalculator.add(1, 2);
        System.out.println("add:" + add);
        int div = arithmeticCalculator.div(21, 3);
        System.out.println("div:"+div);

    }
}
