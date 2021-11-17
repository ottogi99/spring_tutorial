package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends 
	AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected java.lang.Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}
	
	@Override
	protected java.lang.Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
