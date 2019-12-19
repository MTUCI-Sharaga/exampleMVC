package com.films.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { //Корневой контекст приложения типа AnnotationConfigWebApplicationContext
        // будет создан с помощью конфигурационных классов, возвращаемых данным методом
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //.Контекст веб-приложения типа AnnotationConfigWebApplicationContext
        // будет создан с помощью конфигурционных классов, возвращаемых данным методом.
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() { //сопостовление контескста с помощью
        //сервлета диспетчера типа DispetcherServlet указываются в массиве символьных строк, возвращаемом этим методом.
        return new String[]{"/"};
    }
}