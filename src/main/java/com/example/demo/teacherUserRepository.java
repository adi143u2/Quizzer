package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface teacherUserRepository extends JpaRepository<Teacher, Integer> {

	
	
	
	 @Query("select s from Teacher s where teacher_email=?1 AND teacher_password=?2" )
	  Teacher findByUsernameAndPassword(String teacher_email, String teacher_password);
	
	
	
}
