package cn.fengyu.frame.demo.a2;

import cn.fengyu.frame.demo.a1.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/beans-auto.xml");
        //Dao dao = (Dao) context.getBean("dao");
        //Dao daos = (Dao) context.getBean("dao");
        //System.out.println(dao==daos);
        //
        //Dao dao1 = (Dao) context.getBean("dao1");
        //Dao dao2 = (Dao) context.getBean("dao1");
        //System.out.println(dao2==dao1);
        // DataSource dataSource = (DataSource) context.getBean("dataSource");
        //System.out.println(dataSource);
        User user2= (User) context.getBean("boy");
        System.out.println(user2);
        DateFormat simpleDateFormat = (DateFormat) context.getBean("simpleDateFormat");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
