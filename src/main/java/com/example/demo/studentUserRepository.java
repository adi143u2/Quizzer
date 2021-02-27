package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface studentUserRepository extends JpaRepository<Student, Integer> {

	
	
	/*
	 * @Query("select stud_fname from Student where stud_rollno=:stud_rollno AND stud_password=:stud_password"
	 * ) Student findByRollnoAndPassword(int stud_rollno, String stud_password);
	 */
	
}
