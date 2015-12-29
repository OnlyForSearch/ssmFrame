package cn.fengyu.frame.demo.a3.generic.frame.base.impl;

import cn.fengyu.frame.demo.a3.generic.frame.base.IBaseDao;
import cn.fengyu.frame.demo.a3.generic.frame.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class BaseService<T> implements IBaseService<T> {

    @Autowired
    private IBaseDao baseDao;

    @Override
    public void addNew(T t) {
        System.out.println("addNew:"+t.getClass().getSimpleName());
        baseDao.add(t);
    }
}
