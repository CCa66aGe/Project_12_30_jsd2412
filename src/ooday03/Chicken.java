package ooday03;

public class Chicken extends Animal {
    Chicken(){
    }
    Chicken(String name,int age,String color){
        super(name,age,color);
    }

    void layEggs(){
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在下蛋...");
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在吃小米...");
    }
}
