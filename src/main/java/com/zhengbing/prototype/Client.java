package com.zhengbing.prototype;

/**
 * 原型模式 - 客户端测试
 *
 * @author zhengbing
 * @date 2021/3/4 23:06
 * @since 1.0
 */
public class Client {

  public static void main(String[] args) throws CloneNotSupportedException {
    Realizetype rz1 = new Realizetype();
    Realizetype rz2 = (Realizetype) rz1.clone();
    System.out.println("rz1 == rz2 ? " + (rz1 == rz2));
  }
}
