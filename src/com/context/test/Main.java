package com.context.test;

import com.laozhao.BeanFactory.BeanContext;

public class Main {
  public static void main(String[] args) {
	  BeanContext bean=new BeanContext();
	  bean.makeContext(new Config());
}
}
