package cn.fengyu.frame.demo.a3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void addNew() {
        System.out.println("添加新用户");
        userDao.save();
    }

}
