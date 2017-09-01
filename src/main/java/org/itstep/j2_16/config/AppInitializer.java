package org.itstep.j2_16.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
  //      return new Class[0];
        return null;
    }

    @Override
    protected String[] getServletMappings() {
         {return new String[] {"/"};}

    }


}
