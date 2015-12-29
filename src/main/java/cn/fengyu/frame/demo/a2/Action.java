package cn.fengyu.frame.demo.a2;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Action {
    private Service service;
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public void execute() {
        System.out.println("Action's execute...");
        service.save();
    }
}
