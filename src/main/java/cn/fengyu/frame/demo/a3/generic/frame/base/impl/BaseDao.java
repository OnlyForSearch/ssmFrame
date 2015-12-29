package cn.fengyu.frame.demo.a3.generic.frame.base.impl;

import cn.fengyu.frame.demo.a3.generic.frame.base.IBaseDao;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class BaseDao<T> implements IBaseDao<T> {

    @Override
    public void add(T t) {
        System.out.println("Basedao save :"+t.getClass().getSimpleName());
    }
}
