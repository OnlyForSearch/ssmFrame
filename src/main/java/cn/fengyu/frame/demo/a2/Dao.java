package cn.fengyu.frame.demo.a2;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Dao {

    private String dataSource = "dbcp";
    public Dao(String dataSource) {
        this.dataSource = dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    public void save(){
        System.out.println("save by... "+dataSource);
    }
    public Dao() {
        System.out.println("Dao constructor.....");
    }

    @Override
    public String toString() {
        return "Dao{" +
                "dataSource='" + dataSource + '\'' +
                '}';
    }
}
