package com.lea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzc
 * @create 2020-10-14 13:59
 */
@Controller
public class TestController {

    @RequestMapping("hello")
    public Object hello() {
        System.out.println("hello");
        return "success";
    }

    /*
       支持ANT通配符访问路径 ?\*\**
       支持占位符访问路径{nameKey}
     */
    @RequestMapping("test/{id}/{username}")
    public Object testREST(@PathVariable("id") Integer id, @PathVariable("username")String username) {
        System.out.println("id:" + id);
        System.out.println("username:" + username);
        return "success";
    }

    /*
    View ：
        实现页面跳转
        redirect:重定向
     */
    @RequestMapping("testRedirect")
    public Object testRedirect(@PathVariable("id") Integer id, @PathVariable("username")String username) {
        System.out.println("id:" + id);
        System.out.println("username:" + username);
        return "redirect:result";
    }


}
