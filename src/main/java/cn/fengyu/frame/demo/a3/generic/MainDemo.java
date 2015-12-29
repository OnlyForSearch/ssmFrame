package cn.fengyu.frame.demo.a3.generic;

import cn.fengyu.frame.demo.a3.generic.frame.model.PeoPle;
import cn.fengyu.frame.demo.a3.generic.frame.service.PeopleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MainDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/beans-annotation.xml");
        RoleService bean = context.getBean(RoleService.class);
        bean.addNew(new Role());
        UserService userService = context.getBean(UserService.class);
        userService.addNew(new User());
        PeopleService bean1 = context.getBean(PeopleService.class);
        bean1.addNew(new PeoPle());

    }
}
