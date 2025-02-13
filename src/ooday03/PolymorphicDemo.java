package ooday03;
/**
 * 多态的测试类
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        //演示向上造型：
        /*
        Dog o1 = new Dog("小黑",2,"黑");    //狗是狗
        //o1.name/age/color/eat()/drink()/swim()/lookHome();
        Animal o2 = new Dog("小黑",2,"黑"); //狗是动物-------向上造型
        //o2.name/age/color/eat()/drink();
        Swim o3 = new Dog("小黑",2,"黑");   //狗会游泳-------向上造型
        //o3.swim();
        */

        //演示向上造型(多态)的第1点应用：
        /*
        Master master = new Master();
        Dog dog = new Dog("小黑",2,"黑");
        Chicken chicken = new Chicken("小花",3,"花");
        Fish fish = new Fish("小金",1,"金");
        master.feed(dog);       //在传参的同时，系统自动做了向上造型
        master.feed(chicken);
        master.feed(fish);
         */

        //演示向上造型(多态)的第2点应用：

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("小黑",2,"黑"); //向上造型
        animals[1] = new Dog("小白",2,"白");
        animals[2] = new Fish("小金",2,"金");
        animals[3] = new Fish("小花",2,"花");
        animals[4] = new Chicken("小灰",2,"灰");
        for (int i=0;i<animals.length;i++){ //animals. 只能点Animal类里面的 属性减少
            System.out.println(animals[i].name); //输出每个动物的名字
            animals[i].drink();
            animals[i].eat();

            //狗能看家、游泳，鱼能游泳，鸡能下蛋
            if (animals[i] instanceof Dog){
                Dog dog = (Dog)animals[i];
                dog.lookHome();
            }
//            if (animals[i] instanceof Fish){
//                Fish fish = (Fish)animals[i];
//            }
            if (animals[i] instanceof Chicken){
                Chicken chicken = (Chicken)animals[i];
                chicken.layEggs();
            }
            if (animals[i] instanceof Swim){ //适用于所有实现Swim接口的(会游泳的)
            Swim s = (Swim)animals[i];
                s.swim();
            }
        }



        //演示强转成功的条件：
        /*
        Animal o1 = new Dog("小黑",2,"黑"); //o1能强转为：Dog，Swim，Animal
        Dog d = (Dog)o1;	//引用o1所指向的对象，就是Dog类型
        Swim s = (Swim)o1;	//引用o1所指向的对象，实现了Swim接口
        System.out.println(o1 instanceof Dog);  //true
        System.out.println(o1 instanceof Swim); //true
        System.out.println(o1 instanceof Fish); //false
        if (o1 instanceof Fish){ //false
            Fish f = (Fish)o1;
        }
        */


    }
}
