package com.example.demo.controller;

import com.example.demo.entity.QQ;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/qq")
public class QQController {

    @RequestMapping("toQQPage")
    public String toQQPage() {
        return "registerQQ.jsp";
    }

    @RequestMapping("/registerQQ")
    public String registQQ(@Valid QQ qq, BindingResult br, HttpServletRequest req) {
        if (br.hasErrors()) {
            List<FieldError> fes = br.getFieldErrors();
            System.out.println("数据验证没有通过");
            for (FieldError erorr : fes) {
                System.out.println(erorr.getDefaultMessage());
                req.setAttribute(erorr.getField(),erorr.getDefaultMessage());
            }
            return "registerQQ.jsp";
        } else {
            System.out.println("qq");
            return "success.jsp";
        }
    }


}
