package com.laozhao.BeanFactory;

import com.laozhao.annaotion.PackageScan;
import com.laozhao.config.Config;
import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;
public  class BeanContext {
   
	private Map<String,Object>  map=new HashMap();
	
	private String packageScan;
	
	public void makeContext(Config config)
	{
		Annotation[] list=config.getClass().getAnnotations();
		for(Annotation an:list)
		{
			if(an instanceof PackageScan){
				
				PackageScan co=(PackageScan)an;
				packageScan =co.value();
				System.out.println(packageScan);
				String prefix=co.getClass().getResource("").getFile();
				String point=packageScan.substring(0,packageScan.indexOf("."));
				
				
				
			}
		}
	}
}
