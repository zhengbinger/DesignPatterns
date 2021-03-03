package com.zhengbing.factory.abstracts;

/**
 * @author zhengbing
 * @date 2021/3/4 00:05
 * @email mydreambing@126.com
 */
public class ConcreteFactory2 implements AbstractFactory {

  @Override
  public Product1 newProduct1() {
    System.out.println("具体工厂2 --> 生产具体产品1");
    return new ConcoretProduct2();
  }

  @Override
  public Product2 newProduct2() {
    System.out.println("具体工厂2 --> 生产具体产品2");
    return new ConcoretProduct22();
  }
}
