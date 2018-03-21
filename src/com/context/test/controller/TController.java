package com.context.test.controller;

import com.context.test.Service.DemoService;
import com.context.test.bean.TBean;
import com.laozhao.annaotion.AutoSet;

public class TController {
  
	@AutoSet("dd")
	private DemoService demoService;
	
	private TBean tBean;
	
	public void show(){
		demoService.show(tBean);
	}

	public TBean gettBean() {
		return tBean;
	}

	public void settBean(TBean tBean) {
		this.tBean = tBean;
	}
	
	
}
