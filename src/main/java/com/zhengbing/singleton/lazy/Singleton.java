package com.zhengbing.singleton.lazy;

/**
 * 懒汉单例模式实现
 *
 * @author: zhengbing
 * @date: 2020/4/22
 * @email: mydreambing@126.com
 */
public class Singleton {

  private static Singleton singleton = null;

  /** 隐藏默认构造器，私有化 */
  private Singleton() {}

  /**
   * 定义唯一可以获取对象实例的出口
   *
   * @return LazySingleton
   */
  public static Singleton getInstance() {
    if (null == singleton) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
