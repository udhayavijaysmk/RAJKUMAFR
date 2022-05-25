package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Student_Controller {
	@Autowired
	Student_Service stdser;
	
// add by Post
	@PostMapping(value = "/add")
	public String addDetails(@RequestBody Student s) {
		return stdser.addDetails(s);
	}
	
//read by getMap	

	@GetMapping(value = "/show/{id}")
	public Student getDetails(@PathVariable Integer id) {
		return stdser.getDetails(id);
    }
	
//update by putMap 	

	@PutMapping(value = "/update")
	public String updateInformation(@RequestBody Student s) {
		return stdser.updateInformation(s);
	}
// delete by deleteMapping
	@DeleteMapping(value = "/delete/{id}")
	public String deleteInformation(@PathVariable Integer id) {
		return stdser.deleteInformation(id);
	}
	
//  for viewing data as List	
	
	@GetMapping(value="/view")
	public List<Student> getList() {
		return stdser.getList();
	}
	
// adding list
	
	@PostMapping(value="/saveAll") 
	public String saveAll(@RequestBody List<Student> s) {
		return stdser.saveAll(s);
	}

}
