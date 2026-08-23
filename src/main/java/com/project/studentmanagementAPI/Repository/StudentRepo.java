package com.project.studentmanagementAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.project.studentmanagementAPI.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	List<Student>findByName(String name);
	List<Student>findByCourse(String course);
	List<Student>findByAgeGreaterThan(Integer age);
	List<Student>findByCourseOrAge(String course,Integer age);
	
	//custom query
	
	@Query("from Student where course=:course And age=:age")
	List<Student>findbycouseandage(String course,int age);
	
	@Transactional
	@Modifying
	@Query("update Student set age=:age where name=:name")
	int updatedatabasedonName(String name,int age);
	@Transactional
	@Modifying
	@Query("delete from Student where name=:name")
	int deletebasedonName(String name);
}
