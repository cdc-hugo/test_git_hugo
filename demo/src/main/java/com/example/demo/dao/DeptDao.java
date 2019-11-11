package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Dept;

public interface DeptDao {
	
	List<Dept> findAll();

	int add(Dept dept);
}
