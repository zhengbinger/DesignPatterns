package com.zhengbing.singleton.innerclass;

/**
 * 静态内部类方式实现单例模式
 *
 * @author: zhengbing
 * @date: 2020/4/23
 * @email: mydreambing@126.com
 */
public class Singleton {

  private static class SingletonHolder {
    private static Singleton instance = new Singleton();
  }

  private Singleton() {}

  public static Singleton getInstance() {
    return SingletonHolder.instance;
  }
}
