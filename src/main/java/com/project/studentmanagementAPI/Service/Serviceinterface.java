package com.project.studentmanagementAPI.Service;

import java.util.List;

import com.project.studentmanagementAPI.model.Student;

public interface Serviceinterface {

	String AddStudent(Student student);
	Iterable<Student> AddStudentlist(Iterable<Student>student);
	Iterable<Student>getStudentByid(Iterable<Integer>ids);
	String updatestudent(Student student);
	
	Iterable<Student>getAllStudent();
	Student getStudentByid(Integer id);
	
	String deletelistofstudenbyid(List<Integer>ids);
	String deletestudentbyid(Integer id);
	
	//custom finder methods
	List<Student>fetchbyname(String name);
	List<Student>fetchybycourse(String course);
	List<Student>fetchbyagegreaterThan(Integer age);
	List<Student>fetchbycourseOrage(String course,Integer age);
	
	//custome qeury
	
	List<Student>fetchbycorseandage(String course,int age);
	String updateagebyname(String name,int age);
	
	String deletebasedonName(String name);
}
