package cn.fengyu.frame.demo.a1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Main {
    int a=3+5;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/beans.xml");
        //HelloWorld helloWorld= (HelloWorld) ctx.getBean("helloWorld");
        //helloWorld.hello();
        //HelloWorld helloWorld2 = (HelloWorld) ctx.getBean("helloWorld2");
        //helloWorld2.hello();
        //Car car1 = (Car) ctx.getBean("car");
        //println(car1);
        //Car car2 = (Car) ctx.getBean("car2");
        //println(car2);
        //User user = (User) ctx.getBean("user");
        //User user2 = (User) ctx.getBean("user2");
        //User bean = (User) ctx.getBean("user3");
        //System.out.println(bean);
        User user4 = (User) ctx.getBean("user5");
        System.out.println(user4);


    }
    public static void println(Object object) {
        System.out.println(object);
    }
}
