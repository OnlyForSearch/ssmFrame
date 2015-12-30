package cn.fengyu.frame.exception;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
public class UserAccountException  extends  RuntimeException {

    public UserAccountException() {
        super();
    }
    public UserAccountException(String message) {
        super(message);
    }
    public UserAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
