package com.project.studentmanagementAPI.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
	private String name;
	private String email;
	private String course;
	private Integer age;
@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", Course=" + course + ", age=" + age
				+ "]";
	}
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student( String name, String email, String course, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.age = age;
	}
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
