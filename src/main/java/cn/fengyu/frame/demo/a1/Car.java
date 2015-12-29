package cn.fengyu.frame.demo.a1;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
public class Car {
    private String company;
    private String brand;
    private  int maxSpedd;
    private  float price;

    public Car(float price, String brand, String company) {
        this.price = price;
        this.brand = brand;
        this.company = company;
    }

    public Car(String company, String brand, int maxSpedd) {
        this.company = company;
        this.brand = brand;
        this.maxSpedd = maxSpedd;
    }

    public Car(String company, String brand, int maxSpedd, float price) {
        this.company = company;
        this.brand = brand;
        this.maxSpedd = maxSpedd;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpedd=" + maxSpedd +
                ", price=" + price +
                '}';
    }
}
