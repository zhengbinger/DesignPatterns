package com.zhengbing.factory.simple;

/**
 * @author zhengbing
 * @date 2021/3/3 23:52
 * @email mydreambing@126.com
 */
public class SimpleFactory {
  public static final int PRODUCT_1 = 1;
  public static final int PRODUCT_2 = 2;

  /**
   * 制造产品
   *
   * @param product 产品类型
   * @return Product
   */
  public static Product makeProduct(int product) {
    switch (product) {
      case PRODUCT_1:
        return new ConcoretProduct1();
      case PRODUCT_2:
        return new ConcoretProduct2();
      default:
        return null;
    }
  }
}
