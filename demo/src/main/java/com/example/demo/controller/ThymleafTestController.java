package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/test")
@Controller
public class ThymleafTestController {

    @RequestMapping("/test01")
    public String test01(HttpServletRequest req){

        req.setAttribute("cent","<input type='button' value='success'/>");

        return "ThymleafTest.html";
    }
    @RequestMapping("/test02")
    public String test02(HttpServletRequest req){
    List<String> list=new ArrayList<String>();
        list.add("嘿嘿");
        list.add("嘻嘻");
        list.add("滴滴");
        list.add("咪咪");
        req.setAttribute("list",list);
        return "ThymleafTest.html";
    }
    @RequestMapping("/test03")
    public String test03(HttpServletRequest req){



        return "ThymleafTest.html";
    }@RequestMapping("/test04")
    public String test04(HttpServletRequest req){



        return "ThymleafTest.html";
    }

}
