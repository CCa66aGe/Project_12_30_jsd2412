package ooday02;

public class AnimalTest {
    public static void main(String[] args) {
        Dog g = new Dog("小黑",2,"黑");
        g.eat();        //Dog类重写之后的
        g.drink();      //复用Ainmal类的
        g.lookHome();   //Dog类所特有的

        Chicken c = new Chicken("小咯",3,"金");
        c.eat();
        c.drink();
        c.layEggs();

        Fish f = new Fish("小金",1,"花");
        f.eat();
        f.drink();
    }
}
