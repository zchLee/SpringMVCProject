package com.lea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lzc
 * @create 2020-10-14 16:07
 */
@Controller
public class ParamController {

    @RequestMapping(value = "params")
    public String param() {
        return "params";
    }

    /*
    @RequestHeader: 获取请求头中信息
    @CookieValue: 拿到cookie中的值
    @RequestParam： 单个参数的数据key
        required: 是否必须被赋值 默认为true，必须赋值
        defaultValue： 若传值为空，的默认值

    HttpServletRequest: 从请求头中获取数据
    HttpServletResponse: 从响应体中获取数据
    HttpSession：        从Session中获取数据
     */
    @RequestMapping(value = "param")
    public String rest1(@RequestParam(value = "username")String username, Integer id) {
        System.out.println("username :" + username);
        System.out.println("id:" + id);
        return "success";
    }


    /*
    ModelAndView: 传输数据和跳转视图
    其他两种传输数据方法：
        方法参数中 Map<String, Object>、 Model
     */
    @RequestMapping("trans/value")
    public ModelAndView paramByModel(Model model) {
        ModelAndView view = new ModelAndView();
        view.setViewName("success"); // 设置跳转页面
        model.addAttribute("model", "model参数");
        view.addObject("data", "数据集合");  // 设置数据源
        return view;
    };
}
