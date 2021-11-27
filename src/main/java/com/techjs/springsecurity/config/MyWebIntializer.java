package com.techjs.springsecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer 
{
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[] {MyConfig.class};
	}

	protected String[] getServletMappings() 
	{
		return new String[] {"/"};
	}

}
