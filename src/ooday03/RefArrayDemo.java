package ooday03;

public class RefArrayDemo {
    public static void main(String[] args) {

        /*
        //声明Dog型数组dogs，包含3个元素，每个元素都是Dog型，默认为null
        Dog[] dogs = new Dog[3]; //引用类型数组---创建Dog数组对象
        dogs[0] = new Dog("小黑",2,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小灰",3,"灰");

        //声明Chicken型数组chickens，包含3个元素，每个元素都是Chicken型，默认为null
        Chicken[] chickens = new Chicken[2];
        chickens[0] = new Chicken("小黄",2,"黄");
        chickens[1] = new Chicken("大黄",2,"黄");

        //声明Fish型数组fish，包含2个元素，每个元素都是Fish型，默认为null
        Fish[] fish = new Fish[4];
        fish[0] = new Fish("小金",1,"金");
        fish[1] = new Fish("小红",2,"红");
        fish[2] = new Fish("小绿",2,"绿");
        fish[3] = new Fish("小蓝",4,"蓝");
         */

        Dog[] dogs = new Dog[3]; //引用类型数组---创建Dog数组对象
        dogs[0] = new Dog("小黑",2,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小灰",3,"灰");
        System.out.println(dogs[0].name);
        dogs[0].age = 12;
        System.out.println(dogs[0].age);
        dogs[1].swim();
        dogs[2].lookHome();
        for (int i=0;i<dogs.length;i++){
            System.out.println(dogs[i].name);
        }

        Chicken[] chickens = new Chicken[2];
        chickens[0] = new Chicken("小黄",2,"黄");
        chickens[1] = new Chicken("大黄",2,"黄");
        for (int i=0;i<chickens.length;i++){
            chickens[i].layEggs();
        }

        Fish[] fish = new Fish[4];
        fish[0] = new Fish("小金",1,"金");
        fish[1] = new Fish("小红",2,"红");
        fish[2] = new Fish("小绿",2,"绿");
        fish[3] = new Fish("小蓝",4,"蓝");
        for (int i=0;i<fish.length;i++){
            System.out.println(fish[i].color);
        }

    }
}
