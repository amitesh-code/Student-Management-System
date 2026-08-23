package com.project.studentmanagementAPI.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.studentmanagementAPI.Service.Serviceinterface;
import com.project.studentmanagementAPI.model.Student;


@Controller
public class Studentcontroller {

	private Serviceinterface service;

	@Autowired
	public void setService(Serviceinterface service) {
		this.service = service;
	}
	
	@GetMapping("/getinfo")
	public String getallinfo(Map<String,Object>mp) {
		
		
		List<Student>ls=(List<Student>) service.getAllStudent();
		mp.put("info", ls);
		
		return "allinfo";
		
	}
	@GetMapping("/home")
	public String homepage() {
		
		return "home";
	}
	@GetMapping("/addstudent")
	public String showstudnetform(Model model) {
		
		model.addAttribute("student", new Student());
		
		return "studentform";
	}
	@PostMapping("/savestudent")
	public String addstudents(@ModelAttribute("student") Student student) {
		
		service.AddStudent(student);
		
		
		return "redirect:/getinfo";
	}
	
	@GetMapping("update/{id}")
	public String updatestudent(@PathVariable("id")Integer id,Model model) {
		
		Student student=service.getStudentByid(id);
		
		model.addAttribute("student", student);
		
		return "updateform";
	}
	@GetMapping("/delete")
	public String deletestudent(@RequestParam("id")Integer id) {
		
		
		service.deletestudentbyid(id);
		
		return "redirect:/getinfo";
	}
	
	@GetMapping("/search")
	public String searchsection() {
		
		
		return "searchstudent";
	}
	
	@GetMapping("/searchbyname")
	public String searchstudentbyname(String name,Model model) {
		
		List<Student>ls=service.fetchbyname(name);
		
		model.addAttribute("student", ls);
		
		return "searchedfile";
	}
	
	@GetMapping("/searchbycourse")
	public String searchbycourse(String course,Model model) {
		
		List<Student>student=service.fetchybycourse(course);
		model.addAttribute("student", student);
		
		return "searchedfile";
	}
	
	@GetMapping("/searchbyagegreater")
	public String searchbyagegreater(Integer age,Model model) {
		
		List<Student>student=service.fetchbyagegreaterThan(age);
		model.addAttribute("student", student);
		
		return "searchedfile";
	}
	
}
