package com.zhengbing.factory.abstracts;

/**
 * @author zhengbing
 * @date 2021/3/4 00:10
 * @email mydreambing@126.com
 */
public class Client {
  public static void main(String[] args) {
    AbstractFactory factory = null;

    factory = new ConcreteFactory1();
    factory.newProduct1();
    factory.newProduct2();

    factory = new ConcreteFactory2();
    factory.newProduct1();
    factory.newProduct2();
  }
}
