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
		          
//		          Student st1=new Student(1,"amitesh","amitesh@gmail.com","CS",19);
//		          
//		          String status=obj.AddStudent(st1);
//		          System.out.println(status);
		          
//		          List<Student>ls=new ArrayList<>();
//		          ls.add(new Student(2,"ray","ray@gmail.com","CS",19));
//		          ls.add(new Student(3,"ranjan","ranjan@gmail.com","Electronics",19));
//		          ls.add(new Student(4,"Abhishek","Abhishek@gmail.com","Mechanical",20));
//		          ls.add(new Student(5,"Shashi","shashi@gmail.com","Instumentation",21));
//		          
//		         obj.AddStudentlist(ls).forEach(e->System.out.println(e));
		          
//		          List<Integer>ids=new ArrayList<>(List.of(1,2,3,4));
//		          obj.getStudentByid(ids).forEach(e->System.out.println(e));
		          
//		          obj.getAllStudent().forEach(e->System.out.println(e));
		          
//		          obj.getstudentbyid(ids).forEach(e->System.out.println(e));
		          
//		         String status=obj.deletestudentbyid(10);
//		         System.out.println(status);
		          
//		          obj.fetchbyname("ray").forEach(e->System.out.println(e));
//		          obj.fetchbyagegreaterThan(15).forEach(e->System.out.println(e));
		          
//		          obj.fetchbycourseOrage("CS", 19).forEach(e->System.out.println(e));
//		          obj.fetchybycourse("CS").forEach(e->System.out.println(e));
//		          obj.fetchbycorseandage("CS", 19).forEach(e->System.out.println(e));
//		          
//		          String status=obj.updateagebyname("ray", 20);
//		          System.out.println(status);
//		          String status=obj.deletebasedonName("amitesh");
//		          System.out.println(status);
//		          
	}
	

}
