package cn.fengyu.frame.demo.a3.generic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */

public class BaseService<T> {
    @Autowired
    private BaseDao<T> baseDao;
    public void addNew(T t) {
        System.out.println("addNew by:"+baseDao);
        baseDao.save(t);

    }

}
