package com.lea.controller;

import com.lea.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author lzc
 * @create 2020-10-20 16:36
 */
@Controller
public class TestSpring {

    @RequestMapping("spring")
    public String test(HttpSession session) {
        ApplicationContext ac = (ApplicationContext) session.getServletContext().getAttribute("ac");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
        return "success";
    }
}
