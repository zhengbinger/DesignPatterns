package com.zhengbing.build;

/**
 * 建造者模式 - 被建造对象
 *
 * @author zhengbing
 * @date 2021/3/2 23:14
 * @since 1.0
 */
public class Product {

  private String name;
  private long price;
  private int count;

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public long getPrice() {
    return price;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "Product{" + "name='" + name + '\'' + ", price=" + price + ", count=" + count + '}';
  }
}
