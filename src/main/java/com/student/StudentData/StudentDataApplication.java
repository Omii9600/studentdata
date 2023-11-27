package com.student.StudentData;

import org.springframework.boot.SpringApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataApplication.class, args);

	}

}
