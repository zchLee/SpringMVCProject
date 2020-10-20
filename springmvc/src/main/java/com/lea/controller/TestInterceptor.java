package com.lea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzc
 * @create 2020-10-19 16:54
 *
 * 测试拦截器
 */
@Controller
public class TestInterceptor {

    /*
    preHandler 按照拦截器数组的正向顺序执行

    post，afterHandler按照拦截器数组的反向顺序执行
     */
    @RequestMapping("test")
    public String test() {
        return "success";
    }
}
