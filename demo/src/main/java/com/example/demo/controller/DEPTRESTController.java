package com.example.demo.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.Dept;

@RestController
@RequestMapping("/deptRest")
public class DEPTRESTController {
	
	private final Log log = LogFactory.getLog(DEPTRESTController.class);

	@Autowired
	private DeptDao dao;


	@PostMapping("addDept")
	@Transactional(rollbackFor = Exception.class)
	public boolean addDept(@RequestBody Dept dept) throws Exception {

		System.out.println(dept.getDate().toString());
		System.out.println(dept);
		return false;
	}
	

	
	

}
