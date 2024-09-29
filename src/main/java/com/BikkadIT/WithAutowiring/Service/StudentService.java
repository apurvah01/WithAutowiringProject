package com.BikkadIT.WithAutowiring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.WithAutowiring.Dao.StudentDao;
import com.BikkadIT.WithAutowiring.Model.Student;
@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public StudentService() {
		super();
		System.out.println("StudentService Constructor");
	}

	public Student saveStudentService(Student stu) {
		
		
	    Student stu1 = studentDao.savestudentDao(stu);
		return stu1;
		
	}

}
