package ooday03.homework.Animal03;

public class TestDemo {
    public static void main(String[] args) {

        Master master = new Master();
        Dog dog = new Dog("小黄","21","黄");
        Chick chick = new Chick("小白","22","白");
        Fish fish = new Fish("小金","23","金");
        master.feed(dog);
        master.feed(chick);
        master.feed(fish);

        Animal[] animals = new Animal[4];
        animals[0] = new Dog("小黄","21","黄");
        animals[1] = new Dog("小黑","24","黑");
        animals[2] = new Chick("小白","22","白");
        animals[3] = new Fish("小金","23","金");

        for (int i=0;i<animals.length;i++){

            System.out.println(animals[i].name);
            System.out.println(animals[i].age);
            animals[i].eat();
            animals[i].drink();

            if (animals[i] instanceof Dog){
                Dog d = (Dog)animals[i];
                d.lookHome();
            }
            if (animals[i] instanceof Chick){
                Chick c = (Chick)animals[i];
                c.layEggs();
            }
            if (animals[i] instanceof Swim){
                Swim s = (Swim)animals[i];
                s.swim();
            }
        }
    }
}
