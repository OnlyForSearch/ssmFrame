package cn.fengyu.frame.demo.a4;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class HelloWorld {
    private String user;
    public HelloWorld() {
        System.out.println("HelloWorld's constructor...");
    }
    public void setUser(String user) {
        this.user = user;
    }

    public void hello() {
        System.out.println("Helloworld:"+user);
    }
    public void init() {
        System.out.println("init method...");
    }
    public void destroy() {
        System.out.println("destroy method...");
    }

}
