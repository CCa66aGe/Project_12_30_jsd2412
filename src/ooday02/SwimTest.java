package ooday02;

public class SwimTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑",2,"黑");
        dog.eat();          //Dog类重写之后的
        dog.drink();        //复用Animal类的
        dog.swim();         //Dog类重写之后的
        dog.lookHome();     //Dog类所特有的

        Chicken chicken = new Chicken("小鸡",1,"白");
        chicken.eat();      //Chicken类重写之后的
        chicken.drink();    //复用Animal类的
        chicken.layEggs();  //Chicken类特有的

        Fish fish = new Fish("小金",2,"金");
        fish.eat();         //fish类重写之后的
        fish.drink();       //复用Animal类的
        fish.swim();        //fish类重写之后的

    }
}
