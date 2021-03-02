package com.zhengbing.build;

/**
 * 建造者模式 - 指挥者，调用具体建造者中的方法完成复杂对象的创建
 *
 * @author zhengbing
 * @date 2021/3/2 23:24
 * @since 1.0
 */
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  /**
   * 产品构建与组装的方法
   *
   * @return Product
   */
  public Product construct() {
    builder.buildName();
    builder.buildPrice();
    builder.buildCount();
    return builder.getResult();
  }
}
