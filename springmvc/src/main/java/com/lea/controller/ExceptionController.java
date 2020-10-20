package com.lea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lzc
 * @create 2020-10-19 17:51
 */
@Controller
public class ExceptionController {

    @RequestMapping("exception")
    public String test() {
        String s = null;
        s.indexOf("1");
        return "success";
    }
}
