package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Student_Dao {
	@Autowired
	Student_Repo stdrepo;

// add
	public String addDetails(Student s) {
		stdrepo.save(s);
		return "Saved Successfully";
		}
	
// read	
	public Student getDetails(Integer id) {
		return stdrepo.findById(id).get();
	
	}
	
//update	
	 public String updateInformation(Student s) {
	    	stdrepo.save(s).getId();
	    	return "Data Updated Successfully";
	    }
	 
//delete  	 
	    public String deleteInformation(Integer id ) {
	    	stdrepo.deleteById(id);
	    	return "Data Successfully deleted";
	    }
	    
// to view data As LIST	    
	    public List<Student> getList() {
	    	return stdrepo.findAll();
	    }
	    
	    public String saveAll( List<Student> s) {
	    	for(Student t :s) {
	    		stdrepo.save(t);
	    	}
	    	return "Successfully Added";
	    }
}
