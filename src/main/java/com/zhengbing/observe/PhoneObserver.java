package com.zhengbing.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhengbing
 * @date 2021/3/2 14:52
 * @since 1.0
 */
public class PhoneObserver implements Observer {
  private String name;

  public PhoneObserver(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof MobilePhone) {
      System.out.println("test monitor " + name + ",price is ￥" + arg);
    }
  }
}
