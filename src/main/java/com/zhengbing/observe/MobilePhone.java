package com.zhengbing.observe;

import java.util.Observable;

/**
 * @author zhengbing
 * @date 2021/3/2 14:39
 * @since 1.0
 */
public class MobilePhone extends Observable {

  private long phonePrice;

  public MobilePhone(long phonePrice) {
    this.phonePrice = phonePrice;
  }

  public void setPhonePrice(long phonePrice) {
    if (phonePrice != this.phonePrice) {
      setChanged();
    }
    if (phonePrice < this.phonePrice) {
      notifyObservers(phonePrice);
    }
    this.phonePrice = phonePrice;
  }

  @Override
  public String toString() {
    return "price is ￥" + phonePrice + " . ";
  }
}
