package com.BikkadIT.WithAutowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.WithAutowiring.Controller.StudentController;
import com.BikkadIT.WithAutowiring.Model.Student;

@SpringBootApplication
public class WithAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WithAutowiringApplication.class, args);
		 StudentController studentController = context.getBean(StudentController.class);
		
		Student stu = new Student();
		stu.setStuId(1);
		stu.setStuName("Priya");
		stu.setStuAddress("Pune");
		
		
		Student student = studentController.saveStudentController(stu);
		System.out.println( student);
	}

}
