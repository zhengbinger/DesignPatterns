package com.zhengbing.singleton.hungry;

/**
 * 饿汉式单例模式实现
 *
 * @author: zhengbing
 * @date: 2020/4/23
 * @email: mydreambing@126.com
 */
public class Singleton {

  /** 类加载时就把对象创建好 */
  private static Singleton singleton = new Singleton();

  /** 隐藏默认构造器，私有化 */
  private Singleton() {}

  /**
   * 唯一获取实例的出口
   *
   * @return HungrySingleton
   */
  public static Singleton getInstance() {
    return singleton;
  }
}
