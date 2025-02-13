package ooday01;

public class ConsTest {
    public static void main(String[] args) {
        Car bm = new Car();
        bm.brand = "宝马";
        bm.color = "白";
        bm.price = 600000;
        bm.capacity = 5;
        bm.start();
        Car ad = new Car("奥迪","银",500000,5);
        ad.start();
        Car bc = new Car("奔驰","黑",900000,6);
        bc.start();
    }
}
