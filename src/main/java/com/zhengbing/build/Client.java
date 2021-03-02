package com.zhengbing.build;

/**
 * 客户端
 *
 * @author zhengbing
 * @date 2021/3/3 00:04
 * @since 1.0
 */
public class Client {

  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    Product product = director.construct();
    System.out.println(product.toString());
  }
}
