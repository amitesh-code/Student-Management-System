package com.project.studentmanagementAPI.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.studentmanagementAPI.Repository.StudentRepo;
import com.project.studentmanagementAPI.model.Student;

@Service
public class Serviceclass implements Serviceinterface {
	
	private StudentRepo repo;

    @Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public String AddStudent(Student student) {
		
		Student s=repo.save(student);
		
		
		return "student with id"+student.getId()+"get added successfully!";
	}

	@Override
	public Iterable<Student> AddStudentlist(Iterable<Student> student) {
		
		return repo.saveAll(student);
		
		
	}

	@Override
	public Iterable<Student> getStudentByid(Iterable<Integer> ids) {
		
		return repo.findAllById(ids);
	}

	@Override
	public  String updatestudent( Student student) {
	    
		repo.save(student);
		
		return "data get updated successfuly";
	}

	

	@Override
	public Iterable<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public String deletelistofstudenbyid(List<Integer> ids) {
		
		List<Student>ls=repo.findAllById(ids);
		
		if(ls.size()==ids.size()) {
			repo.deleteAllByIdInBatch(ids);
			return "All ids get deleted Successfully";
		}
		return "unable to find ids";
		
	}

	@Override
	public String deletestudentbyid(Integer id) {

        Optional<Student> op = repo.findById(id);
        if(op.isPresent()) {
        	repo.deleteById(id);;
        	return "id:"+id+"get deleted successfully";
        }
		return "unable to find:"+id;
	}

	@Override
	public List<Student> fetchbyname(String name) {
		
		return repo.findByName(name);
		
	}

	@Override
	public List<Student> fetchybycourse(String course) {
		
		System.out.println("COURSE RECEIVED = [" + course + "]");

	    List<Student> result = repo.findByCourse(course);

	    System.out.println("RESULT SIZE = " + result.size());

	    return result;
	}

	@Override
	public List<Student> fetchbyagegreaterThan(Integer age) {
		
		return repo.findByAgeGreaterThan(age);
	}

	@Override
	public List<Student> fetchbycourseOrage(String course, Integer age) {
		
		return repo.findByCourseOrAge(course, age);
	}

	@Override
	public List<Student> fetchbycorseandage(String course, int age) {
		
		return repo.findbycouseandage(course, age);
	}

	@Override
	public String updateagebyname(String name, int age) {
		int rows=repo.updatedatabasedonName(name, age);
		if(rows!=0) {
			return "update is done for the name:"+name;
		}
		return "update is not happen for name:+"+name;
	}

	@Override
	public String deletebasedonName(String name) {
		
		int rows=repo.deletebasedonName(name);
		if(rows!=0) {
			return "delete is done for the name:"+name;
		}
		return "delete is nto happend for name";
	}

	@Override
	public Student getStudentByid(Integer id) {
		
		return repo.getReferenceById(id);
	}
	
	

}
