package cn.fengyu.frame.demo.a2;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Service {

    private Dao dao;
    public void setDao(Dao dao) {
        this.dao=dao;
    }
    public Dao getDao() {
        return dao;
    }

    public void save() {
        System.out.println("Service save...");
        dao.save();
    }



}
