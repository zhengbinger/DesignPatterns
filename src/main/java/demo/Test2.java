package demo;

import java.io.*;

/**
 * @author: zhengbing
 * @date: 2020/6/2
 * @email: mydreambing@126.com
 */
public class Test2 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(new FileOutputStream(new File("singlton.txt")));
    objectOutputStream.writeObject(Singleton.getSingleton());
    objectOutputStream.close();

    ObjectInputStream objectInputStream =
        new ObjectInputStream(new FileInputStream(new File("singlton.txt")));
    Singleton singleton1 = (Singleton) objectInputStream.readObject();
    objectInputStream.close();

    Singleton singleton2 = Singleton.getSingleton();

    System.out.println(singleton1 == singleton2);
  }
}
