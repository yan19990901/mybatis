package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class HellloController {
    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request, HttpSession session) {
        System.out.println("hello...ts=" + System.currentTimeMillis());

        RequestContext requestContext = new RequestContext(request);
        String message = requestContext.getMessage("hello.label");
        System.out.println(message);
        session.setAttribute("message", message);

        return "redirect:/test/toMain";
    }

    @RequestMapping("/add")
    public String add(String name, HttpServletRequest request) {
        System.out.println("add..." + name + "...ts=" + System.currentTimeMillis());
        request.setAttribute("name", name);
        return null;
    }

//    @RequestMapping("/main")
//    public String main(String name, HttpServletRequest request) {
//        System.out.println("add..." + name + "...ts=" + System.currentTimeMillis());
//        request.setAttribute("name", name);
//        return "redirect:/toMain";
//    }

    @RequestMapping("/toMain")
    public String toMain() {
        return "main";
    }
}
