package com.BikkadIT.WithAutowiring.Dao;

import org.springframework.stereotype.Repository;

import com.BikkadIT.WithAutowiring.Model.Student;
@Repository
public class StudentDao {
	
	public StudentDao() {
		super();
		System.out.println("StudentDao Constructor");
	}

	public Student savestudentDao(Student stu) {
		System.out.println(stu);
		
		//Logic to store into db
		return stu;
		
	}

}
