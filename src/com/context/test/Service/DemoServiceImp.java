package com.context.test.Service;

import com.context.test.bean.TBean;
import com.laozhao.annaotion.Component;

@Component("dd")
public class DemoServiceImp implements DemoService{
    
	@Override
	public void show(TBean bean) {
		// TODO Auto-generated method stub
		System.out.println("this is auto set :"+bean.getShowStr());
		
	}

}
