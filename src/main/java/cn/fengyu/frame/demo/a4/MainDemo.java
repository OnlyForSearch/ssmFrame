package cn.fengyu.frame.demo.a4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MainDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld==helloWorld2);
        context.close();

    }
}
