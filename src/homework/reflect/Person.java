package homework.reflect;

import homework.reflect.annotations.AutoRunClass;
import homework.reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
    private String name = "张三";
    private int age = 10;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @AutoRunMethod(2)
    public void sayHello() {
        System.out.println(name + ":hello!");
    }
    @AutoRunMethod(3)
    public void sayHi() {
        System.out.println(name + ":Hi!");
    }

    public void doSome() {
        System.out.println(name + ":做某事");
    }

    public void sleep() {
        System.out.println(name + ":睡觉");
    }
    @AutoRunMethod
    public void watchTV() {
        System.out.println(name + ":看电视");
    }

    public void study() {
        System.out.println(name + ":在学习");
    }
    @AutoRunMethod
    public void playGame() {
        System.out.println(name + ":玩游戏");
    }

    public void sing() {
        System.out.println(name + ":在唱歌");
    }

    public void eat(){
        System.out.println(name+":正在干饭");
    }

    public void say(String info) {
        System.out.println(name + ":" + info);
    }

    public void say(String info, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name + ":" + info);
        }
    }
    private void hehe(){
        System.out.println("Person类的私有方法");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
