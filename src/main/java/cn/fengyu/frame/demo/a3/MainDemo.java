package cn.fengyu.frame.demo.a3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MainDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/beans-annotation.xml");
        UserAction bean = context.getBean(UserAction.class);
        bean.execute();
    }

}
