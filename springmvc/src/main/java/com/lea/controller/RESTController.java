package com.lea.controller;

import com.fasterxml.jackson.core.JsonFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lzc
 * @create 2020-10-14 15:29
 */
@Controller
public class RESTController {

    @RequestMapping("result")
    public String rest1() {
        return "result";
    }

    @RequestMapping(value = "rest/{id}", method = RequestMethod.PUT)
    public String rest1(@PathVariable("id")Integer id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "json")
    @ResponseBody // 响应体，而不是返回页面，返回json数据
    public String json() {

        return "{'id':1;'username':'321231'}";
    }
}
