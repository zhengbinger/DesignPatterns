package com.zhengbing.build;

/**
 * 抽象建造者 - 包含创建产品各个部件的抽象方法
 *
 * @author zhengbing
 * @date 2021/3/2 23:17
 * @since 1.0
 */
public abstract class Builder {

  Product product = new Product();

  public abstract void buildName();

  public abstract void buildPrice();

  public abstract void buildCount();

  public Product getResult() {
    return product;
  }
}
