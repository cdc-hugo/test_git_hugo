package com.example.demo.controller;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.Dept;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

@Controller
@RequestMapping("/dept")
public class DeptController {
    private final Log log = LogFactory.getLog(DeptController.class);

    @Autowired
    private DeptDao dao;//正常问题

    @RequestMapping("toPage")
    public String toPage() {
        return "hello.jsp";
    }

    @RequestMapping("listDept")
    public String listDept(HttpServletRequest req) {
        req.setAttribute("data", dao.findAll());
        return "listDept.jsp";
    }
    @RequestMapping("insert")
    @Transactional
    @Scheduled(cron = "* * 1 * * ?")
    public String insert(){
        System.out.println("s");
        dao.add(new Dept(0,"cdc1","abc1",new Date()));
        Integer.parseInt("11");
        dao.add(new Dept(0,"cdc2","abc2",new Date()));
        return "redirect:dept/topage";
    }

    @RequestMapping("uploadFile")
    public String uploadfile(MultipartFile mf) throws Exception {
        String path = "target/" + mf.getOriginalFilename();
        FileOutputStream fs = new FileOutputStream(path);
        IOUtils.copy(mf.getInputStream(), fs);
        fs.close();
        return "";
    }


    @RequestMapping(value = "downLoadFile", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] downLoadFile() throws Exception {
        String path = "target/image1.jpg";
        FileInputStream fs = new FileInputStream(path);
        return IOUtils.toByteArray(fs);
    }


}