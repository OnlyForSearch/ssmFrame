package cn.fengyu.frame.demo.a3.generic;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */

public class BaseDao<T> {

    public void save(T t) {
        System.out.println(t.getClass().getSimpleName()+":save");
    }
}
