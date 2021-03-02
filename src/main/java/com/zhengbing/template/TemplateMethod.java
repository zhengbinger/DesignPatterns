package com.zhengbing.template;

/** 抽象类，含模板方法 */
abstract class AbstractMethod {

  /** 模板方法总成 */
  public void TemplateMethod() {
    specialMethod();
    abstracMethod1();
    abstracMethod2();
  }

  /** 公共方法实现 */
  public void specialMethod() {
    System.out.println("special Method invoke!!!");
  }

  /** 需具体子类具体实现的抽象方法1 */
  public abstract void abstracMethod1();

  /** 需具体子类具体实现的抽象方法1 */
  public abstract void abstracMethod2();
}

/** 具体子类，实现抽象类的抽象方法 */
class InstanceClass extends AbstractMethod {

  @Override
  public void abstracMethod1() {
    System.out.println("abstract method 1 ");
  }

  @Override
  public void abstracMethod2() {
    System.out.println("abstract method 2 ");
  }
}

/**
 * 模板方法模式 - 业务类，调用模板方法抽象类的模板方法
 *
 * @author zhengbing
 * @date 2021/3/2 10:07
 * @version 1.0
 */
public class TemplateMethod {

  public static void main(String[] args) {
    AbstractMethod method = new InstanceClass();
    method.TemplateMethod();
  }
}
