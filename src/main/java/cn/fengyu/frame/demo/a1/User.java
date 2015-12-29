package cn.fengyu.frame.demo.a1;

import java.util.List;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class User {

    private String userName;
    private List<Car>cars;
    private String wifeName;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public String getWifeName() {
        return wifeName;
    }
    public void setWifeName(String wifeName) {
        System.out.println("setWifeName:"+wifeName);
        this.wifeName = wifeName;
    }

    public User() {
        System.out.println("User's constructor...");
    }

    public void init() {
        System.out.println("User init method...");

    }

    public void destroy() {
        System.out.println("User destrory method ...");
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", cars=" + cars +
                ", wifeName='" + wifeName + '\'' +
                '}';
    }
}
