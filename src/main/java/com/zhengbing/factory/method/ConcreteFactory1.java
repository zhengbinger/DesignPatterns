package com.zhengbing.factory.method;

/**
 * @author zhengbing
 * @date 2021/3/4 00:05
 * @email mydreambing@126.com
 */
public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public Product newProduct() {
    System.out.println("具体工厂1 --> 生产具体产品1");
    return new ConcoretProduct1();
  }
}
