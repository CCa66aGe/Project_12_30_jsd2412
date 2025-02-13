package reflect;

public class Student {
    public String name = "阿三";

    public void study(){
        System.out.println(name+":在学习");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
