package com.zhengbing.dp.singleton;

/**
 * 饿汉式单例
 *
 * @author: zhengbing
 * @date: 2020/4/23
 * @email: mydreambing@126.com
 */
public class HungryModel {

  private static HungryModel singletone = new HungryModel();

  public static HungryModel getInstance() {
    return singletone;
  }

  public static void main(String[] args) {
    //
    HungryModel s1 = HungryModel.getInstance();
    HungryModel s2 = HungryModel.getInstance();
    System.out.println(s1.equals(s2));
  }
}
