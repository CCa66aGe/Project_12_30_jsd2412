package homework.homework_h.c01.ooDay02;

public class SwimTest {
    public static void main(String[] args) {
        Dog d = new Dog("小黄",2,"黄");
        d.eat();
        d.drink();
        d.swim();
        d.lookHome();

        Chick c = new Chick("小白",2,"白");
        c.eat();
        c.drink();
        c.layEggs();

        Fish f = new Fish("小金",2,"金");
        f.eat();
        f.drink();
        f.swim();

    }
}
