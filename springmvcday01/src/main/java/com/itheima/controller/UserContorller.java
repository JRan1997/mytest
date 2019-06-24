package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springmvcreview
 * @description:
 * @version:
 */
@Controller
@RequestMapping("/user")
public class UserContorller {

    @RequestMapping("/quick/{name}")
    @ResponseBody
    public String show(@PathVariable("name") String username){
       return username;
    }
}
