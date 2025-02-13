package homework_h.c02.ooDay03;

public class AnimalTestDemo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Dog("小黄",1,"黄");
        animals[1] = new Dog("大黄",2,"黄");
        animals[2] = new Chick("小白",1,"白");
        animals[3] = new Chick("大白",2,"白");
        animals[4] = new Fish("小金",1,"金");
        animals[5] = new Fish("大金",2,"金");

        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();

            if (animals[i] instanceof Dog){
                ((Dog) animals[i]).lookHome();
            }
            if (animals[i] instanceof Chick){
                ((Chick) animals[i]).layEggs();
            }
            if (animals[i] instanceof Swim){
                ((Swim) animals[i]).swim();
            }
        }

        Master master = new Master();
        Dog dog = new Dog("小黄",1,"黄");
        Chick chick = new Chick("小白",1,"白");
        Fish fish = new Fish("小金",1,"金");
        master.feed(dog);
        master.feed(animals[0]);
        master.feed(chick);
        master.feed(fish);
    }
}
