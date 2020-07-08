package com.cpi.jstldemo.service;

import java.util.HashMap;
import java.util.List;

import com.cpi.jstldemo.dao.HomeDAO;
import com.cpi.jstldemo.entity.Student;

public class HomeService {
	HomeDAO homeDAO = new HomeDAO();
	
	public List<Student> getStudents(){
		return homeDAO.getStudents();
	}

	public void addStudent(String name, Integer age) {
		HashMap params = new HashMap<>();
		params.put("name",name);
		params.put("age",age);
		homeDAO.addStudent(params);
		
	}
}
