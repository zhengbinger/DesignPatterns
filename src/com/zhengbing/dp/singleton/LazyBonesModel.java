package com.zhengbing.dp.singleton;

/**
 * 懒汉单例模式
 * @author:  zhengbing
 * @date:    2020/4/22
 * @email:   mydreambing@126.com
 */
public class LazyBonesModel {

    private static LazyBonesModel singleton = null;

    public  static LazyBonesModel getInstance(){
        if (null == singleton) {
            singleton = new LazyBonesModel();
        }
        return singleton;
    }

  public static void main(String[] args) {
    LazyBonesModel sington = LazyBonesModel.getInstance();
    LazyBonesModel sington2 = LazyBonesModel.getInstance();
    System.out.println(sington.equals(sington2));
  }
}
