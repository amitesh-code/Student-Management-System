package com.project.studentmanagementAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.studentmanagementAPI.Service.Serviceinterface;
import com.project.studentmanagementAPI.model.Student;

@SpringBootApplication
public class StudentmanagementApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(StudentmanagementApiApplication.class, args);
	
		          Serviceinterface obj = container.getBean(Serviceinterface.class);
	}
	

}
