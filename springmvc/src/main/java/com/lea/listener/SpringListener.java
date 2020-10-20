package com.lea.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author lzc
 * @create 2020-10-20 16:21
 */
public class SpringListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        ServletContext context = sce.getServletContext();
        context.setAttribute("ac", ac);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
