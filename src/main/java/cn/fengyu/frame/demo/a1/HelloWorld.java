package cn.fengyu.frame.demo.a1;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class HelloWorld {
    private String user;
    public HelloWorld() {
        System.out.println("HelloWorld Constructor ...");
    }
    public HelloWorld(String user) {
        System.out.println("HelloWorld Constructor ..."+user);
        this.user = user;
    }

    public void setUser(String user ) {
        System.out.println("User set:"+user);
        this.user=user;
    }
    public void hello() {
        System.out.println("HelloWorld ...."+user);
    }
}
