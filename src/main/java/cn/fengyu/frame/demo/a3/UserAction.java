package cn.fengyu.frame.demo.a3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
@Controller
public class UserAction {
    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("UserAction execute");
        userService.addNew();
    }



}
