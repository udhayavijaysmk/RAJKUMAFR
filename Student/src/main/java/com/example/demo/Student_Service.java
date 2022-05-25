package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Student_Service {
	@Autowired
	Student_Dao stddao;
	
// add	
	public String addDetails(Student s ) {
		return stddao.addDetails(s);
	}
	
//read	
	public Student getDetails(Integer id) {
		return stddao.getDetails(id);
	}
	
//update 	
    public String updateInformation(Student s) {
    	return stddao.updateInformation(s);
    }
    
 // delete   
    public String deleteInformation(Integer id) {
    	return stddao.deleteInformation(id);
    }
 //to view as List   
    public List<Student> getList() {
    	return stddao.getList();
    }
    
    public String saveAll(List<Student> s) {
    	return stddao.saveAll(s);
    }
    
}
