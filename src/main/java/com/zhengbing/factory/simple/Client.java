package com.zhengbing.factory.simple;

/**
 * @author zhengbing
 * @date 2021/3/3 23:51
 * @email mydreambing@126.com
 */
public class Client {
  public static void main(String[] args) {
    Product product = SimpleFactory.makeProduct(SimpleFactory.PRODUCT_1);
    product.show();
  }
}
