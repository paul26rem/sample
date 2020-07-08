package com.cpi.jstldemo.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cpi.jstldemo.entity.Student;

public class HomeDAO {
	
	String resource = "com/cpi/jstldemo/resource/AppConfig.xml";
	InputStream inputStream ;
	SqlSessionFactory sqlSessionFactory;
	
	public HomeDAO() {
		try {
			this.inputStream = Resources.getResourceAsStream(resource);
			this.sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> getStudents(){
		List<Student> students;
		try (SqlSession session = sqlSessionFactory.openSession()) {
		  students = session.selectList("getStudents");
		}
		return students;
	}

	public void addStudent(HashMap<String, Object> params) {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  session.update("addStudent",params);
			  session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
