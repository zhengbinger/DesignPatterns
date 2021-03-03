package com.zhengbing.factory.method;

/**
 * @author zhengbing
 * @date 2021/3/4 00:05
 * @email mydreambing@126.com
 */
public class ConcreteFactory2 implements AbstractFactory {
  @Override
  public Product newProduct() {
    System.out.println("具体工厂2 --> 生产具体产品2");
    return new ConcoretProduct2();
  }
}
