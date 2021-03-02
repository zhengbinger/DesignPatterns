package com.zhengbing.build;

/**
 * 具体建造者，实现抽象建造者
 *
 * @author zhengbing
 * @date 2021/3/2 23:21
 * @since 1.0
 */
public class ConcreteBuilder extends Builder {
  @Override
  public void buildName() {
    product.setName("name");
  }

  @Override
  public void buildPrice() {
    product.setPrice(2000L);
  }

  @Override
  public void buildCount() {
    product.setCount(5);
  }
}
