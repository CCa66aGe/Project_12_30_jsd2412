package homework.homework_api.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("啊啊.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user = (User)ois.readObject();
        System.out.println(user);
        ois.close();
    }
}
