package com.zhengbing.template;

/**
 * 抽象类，含模板方法
 *
 * @author zhengbing
 * @date 2021/3/2 10:07
 * @version 1.0
 */
abstract class AbstractMethod {

  public void TemplateMethod() {
    specialMethod();
    abstracMethod1();
    abstracMethod2();
  }

  public void specialMethod() {
    System.out.println("special Method invoke!!!");
  }

  public abstract void abstracMethod1();

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

/** 业务类，调用模板方法抽象类的模板方法 */
public class TemplateMethod {

  public static void main(String[] args) {
    AbstractMethod method = new InstanceClass();
    method.TemplateMethod();
  }
}
