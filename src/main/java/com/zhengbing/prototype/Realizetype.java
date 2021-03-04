package com.zhengbing.prototype;

/**
 * 原型模式 - 具体原型类
 *
 * @author zhengbing
 * @date 2021/3/4 23:02
 * @since 1.0
 */
public class Realizetype implements Cloneable {
  Realizetype() {
    System.out.println("具体原型创建成功");
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    System.out.println("具体原型复制成功");
    return (Realizetype) super.clone();
  }
}
