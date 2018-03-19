package com.laozhao.BeanFactory;

import com.laozhao.annaotion.PackageScan;
import com.laozhao.config.Config;
import java.lang.annotation.*;
public  class BeanContext {
   
	public void makeContext(Config config)
	{
		Annotation[] list=config.getClass().getAnnotations();
		for(Annotation an:list)
		{
			if(an instanceof PackageScan){
				
				PackageScan co=(PackageScan)an;
			
				System.out.println(co.Scanpackage());
			}
			//System.out.println(an.getClass());
		}
	}
}
