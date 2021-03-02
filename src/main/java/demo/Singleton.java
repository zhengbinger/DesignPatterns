package demo;

import java.io.Serializable;

/**
 * @author: zhengbing
 * @date: 2020/6/2
 * @email: mydreambing@126.com
 */
public class Singleton implements Serializable {

  private final long serialVersionUID = -10901893;

  private Singleton() {}

  private static class SingletonHoldler {
    private static final Singleton singleton = new Singleton();
  }

  public static synchronized Singleton getSingleton() {
    return SingletonHoldler.singleton;
  }
}
