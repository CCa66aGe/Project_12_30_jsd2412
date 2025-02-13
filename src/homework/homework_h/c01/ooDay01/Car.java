package homework.homework_h.c01.ooDay01;

public class Car {
    String brand;
    String color;
    double price;
    int capacity;

    Car(){}
    Car(String brand,String color,double price,int capacity){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
    }

    void start(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"价格的"+capacity+"座的车启动了");
    }
    void run(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"价格的"+capacity+"座的车跑了");
    }
    void stop(){
        System.out.println(brand+"牌子的"+color+"颜色的"+price+"价格的"+capacity+"座的车停了");
    }
}
