package cn.fengyu.frame.demo.a6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
public class DemoTest {

    public static void main(String[] args) throws SQLException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
        DataSource dataSource= (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        String schema = connection.getSchema();

        System.out.println("================="+ schema);



    }

}
