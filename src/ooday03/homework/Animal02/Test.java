package ooday03.homework.Animal02;

public class Test {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("小黄",1,"黄");
        animals[1] = new Chick("小白",2,"白");
        animals[2] = new Fish("小金",2,"金");

        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].name);

            if (animals[i].age==2){
                animals[i].age = 3;
            }
            System.out.println(animals[i].age);

            animals[i].eat();
            animals[i].drink();

            if (animals[i] instanceof Dog){
                ((Dog)animals[i]).lookHome();
            }
            if (animals[i] instanceof Chick){
                ((Chick)animals[i]).layEggs();
            }
            if (animals[i] instanceof Swim){
                ((Swim)animals[i]).swim();
            }
        }

        Dog dog = new Dog("小黄",2,"黄");
        Chick chick = new Chick("小白",2,"白");
        Fish fish = new Fish("小金",2,"金");
        Master master = new Master();
        master.feed(dog);
        master.feed(chick);
        master.feed(fish);

    }
}
