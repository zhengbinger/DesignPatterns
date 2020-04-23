package com.zhengbing.dp.cor.msb.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * 要求：过滤  request  response,
 */
public class ServerletMain {

  public static void main(String[] args) {
      Request request = new Request();
      Response response = new Response();

      request.str="大家好:),<script>,欢迎访问，zhengbing.com，大家都是996";
      response.str = "response";
      FilterChain fc = new FilterChain();
      fc.add(new HtmlFilter()).add(new SensetiveFilter());
      fc.doFilter(request,response,fc);

      System.out.println(request.str);
      System.out.println(response.str);
  }
}

interface Filter{
        boolean doFilter(Request request, Response response, FilterChain chain);
}

class HtmlFilter implements Filter {

        @Override
        public boolean doFilter(Request request,Response response, FilterChain chain) {
            request.str = request.str.replaceAll("<","[").replaceAll(">","]");
            chain.doFilter(request,response,chain);
            response.str += "--HtmlFilter";
            return true;
        }
    }

class SensetiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request,Response response, FilterChain chain) {
        request.str  = request.str.replaceAll("996","955");
        chain.doFilter(request,response,chain);
        response.str += "--SensetiveFilter";
        return false;
    }
}

class Request{
     String str;
}

class Response{
     String str;
}


class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add (Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request,Response response, FilterChain chain){
           if( index == filters.size() ) {
               return false;
           }
           Filter f = filters.get(index);
           index++;
        return f.doFilter(request,response,chain);
    }
}