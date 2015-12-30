package cn.fengyu.frame.exception;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
public class BookStockException extends  RuntimeException{

    public BookStockException() {
        super();
    }
    public BookStockException(String message) {
        super(message);
    }
    public BookStockException(String message, Throwable cause) {
        super(message, cause);
    }
}
