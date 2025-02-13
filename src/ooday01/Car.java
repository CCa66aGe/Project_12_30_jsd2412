package ooday01;

public class Car { //自己创造的一种数据类型
    //成员变量-----------描述对象的属性
    String brand;
    String color;
    double price;
    int capacity;
    //构造方法
    Car(){
    }
    //          "奥迪"        "银"         500000          5
    Car(String brand,String color,double price,int capacity){
        this.brand = brand;        //ad.brand="奥迪"
        this.color = color;        //ad.color="银"
        this.price = price;        //ad.price=500000
        this.capacity = capacity;  //ad.capacity=5
    }

    //方法---------------描述对象的行为
    void start(){ //        ad.brand            ad.color            ad.capacity        ac.price
        System.out.println(brand+"牌子的"+color+"色的"+capacity+"座的"+price+"块钱的车启动了...");
    }
    void run(){ //        ad.brand            ad.color            ad.capacity        ac.price
        System.out.println(brand+"牌子的"+color+"色的"+capacity+"座的"+price+"块钱的车跑起来了...");
    }
    void stop(){ //        ad.brand            ad.color            ad.capacity        ac.price
        System.out.println(brand+"牌子的"+color+"色的"+capacity+"座的"+price+"块钱的车停止了...");
    }
}
