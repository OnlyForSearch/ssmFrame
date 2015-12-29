package cn.fengyu.frame.demo.a2;

import cn.fengyu.frame.demo.a1.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (beanName.equals("boy")) {
            System.out.println("postProcessBeforeInitialization .."+bean+","+beanName);
            User user = (User) bean;
            user.setUserName("李大齐");

        }
        return bean;

    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("boy")) {
            System.out.println("postProcessAfterInitialization .." + bean + "," + beanName);
            User user = (User) bean;
            user.setUserName("李大齐");

        }
        return  bean;
    }
}
