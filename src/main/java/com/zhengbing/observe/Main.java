package com.zhengbing.observe;

/**
 * 观察者模式 - 模拟客户端
 *
 * @author zhengbing
 * @date 2021/3/2 15:02
 * @since 1.0
 */
public class Main {

  public static void main(String[] args) {

    MobilePhone phone = new MobilePhone(10000);

    PhoneObserver A = new PhoneObserver("A");
    PhoneObserver B = new PhoneObserver("B");
    PhoneObserver C = new PhoneObserver("C");
    PhoneObserver D = new PhoneObserver("D");

    phone.addObserver(A);
    phone.addObserver(B);
    phone.addObserver(C);
    //    phone.addObserver(A);

    System.out.println(phone);
    phone.setPhonePrice(9000);
    System.out.println(phone);
  }
}
