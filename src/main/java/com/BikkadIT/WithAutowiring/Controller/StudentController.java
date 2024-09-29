package com.BikkadIT.WithAutowiring.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.WithAutowiring.Model.Student;
import com.BikkadIT.WithAutowiring.Service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		super();
		System.out.println("StudentController Constructor");
	}

	public Student saveStudentController(Student stu) {
	 
		
		Student stu1 = studentService.saveStudentService(stu);
		return stu1;
		
	}

}
