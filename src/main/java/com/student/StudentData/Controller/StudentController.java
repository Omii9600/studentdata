package com.student.StudentData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.StudentData.Model.MessageResponse;
import com.student.StudentData.Model.Student;
import com.student.StudentData.Repo.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/addstudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student studentData =studentRepository.save(student);
		return ResponseEntity.ok(new MessageResponse(HttpStatus.OK.value(),"Student Added Successful"));
	}
	
	@GetMapping("/getstudent")
	public List<Student> getStudent(){
		List<Student> studentData =studentRepository.findAll();
		return studentData;
	}
	
	@GetMapping("/getstudentbyid")
	public Student getStudentById(@PathVariable Integer id){
		Long longId=new Long(id);
		Student studentData =studentRepository.findById(longId).get();
		return studentData;
	}
	
	

}
