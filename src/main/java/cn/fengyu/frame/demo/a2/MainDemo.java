package cn.fengyu.frame.demo.a2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MainDemo {

    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        Dao dao = (Dao) context.getBean("dao");
        Dao dao2 = (Dao) context.getBean("dao");
        System.out.println(dao == dao2);

        Service service= (Service) context.getBean("service");

        Action action = context.getBean(Action.class);
        action.execute();
        Dao dao3 = (Dao) context.getBean("dao3");
        Dao dao32 = (Dao) context.getBean("dao3");
        System.out.println("dao3==dao32?"+(dao3==dao32));
        //DataSource dataSource = (DataSource) context.getBean("dataSource");
        //System.out.println(dataSource.getConnection());


        //  service.save();

    }
}
