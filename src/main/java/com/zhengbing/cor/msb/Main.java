package com.zhengbing.cor.msb;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Msg msg = new Msg();
    msg.setMsg("大家好:),<script>,欢迎访问，zhengbing.com，大家都是996");

    FilterChain fc = new FilterChain();
    fc.add(new HtmlFilter()).add(new SensetiveFilter());
    fc.doFilter(msg);

    FilterChain fc2 = new FilterChain();
    fc2.add(new FaceFilter()).add(new URLFilter());

    fc.add(fc2);

    fc.doFilter(msg);

    System.out.println(msg);
  }
}

class Msg {
  private String name;
  private String msg;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "Msg{" + "name='" + name + '\'' + ", msg='" + msg + '\'' + '}';
  }
}

interface Filter {
  boolean doFilter(Msg msg);
}

class HtmlFilter implements Filter {

  @Override
  public boolean doFilter(Msg msg) {
    String r = msg.getMsg();
    r = r.replace('<', '[');
    r = r.replace('>', ']');
    msg.setMsg(r);
    return true;
  }
}

class SensetiveFilter implements Filter {

  @Override
  public boolean doFilter(Msg msg) {
    String r = msg.getMsg();
    r = r.replaceAll("996", "955");
    msg.setMsg(r);
    return false;
  }
}

class FaceFilter implements Filter {

  @Override
  public boolean doFilter(Msg msg) {
    String r = msg.getMsg();
    r = r.replace(":)", "^ V ^");
    msg.setMsg(r);
    return true;
  }
}

class URLFilter implements Filter {

  @Override
  public boolean doFilter(Msg msg) {
    String r = msg.getMsg();
    r = r.replace("zhengbing.com", "http:www.zhengbing.com");
    msg.setMsg(r);
    return true;
  }
}

class FilterChain implements Filter {

  List<Filter> filters = new ArrayList<>();

  public FilterChain add(Filter filter) {
    filters.add(filter);
    return this;
  }

  @Override
  public boolean doFilter(Msg msg) {
    for (Filter filter : filters) {
      if (!filter.doFilter(msg)) {
        return false;
      }
    }
    return true;
  }
}
