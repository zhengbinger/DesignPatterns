package com.zhengbing.singleton.enums;

/**
 * 枚举实现单例模式
 *
 * @author: zhengbing
 * @date: 2020/4/23
 * @email: mydreambing@126.com
 */
public enum Singleton {

  /** 对象实例 */
  INSTANCE;

  private void test() {
    System.out.println("this is a enum singleton");
  }
}
