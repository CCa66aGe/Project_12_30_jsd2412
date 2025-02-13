package ooday01;

public class CarTest {
    public static void main(String[] args) {
        //创建一个汽车对象
        Car bm = new Car();
        //访问成员变量
        bm.brand = "宝马";
        bm.color = "白";
        bm.price = 600000;
        bm.capacity = 5;
        //调用方法
        bm.start();
        bm.run();
        bm.stop();

        Car ad = new Car();
        ad.brand = "奥迪";
        ad.color = "银";
        ad.price = 500000;
        ad.capacity = 6;
        ad.start();
        ad.run();
        ad.stop();

        //1)创建了一个汽车对象
        //2)给所有成员变量赋默认值
        Car bc = new Car();
        bc.start();
        bc.run();
        bc.stop();
    }
}
