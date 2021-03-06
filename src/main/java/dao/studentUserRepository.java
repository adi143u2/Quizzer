package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.student;

public interface studentUserRepository extends JpaRepository<student, Integer> {

	
	
	
	
	  @Query("select s from student s where stud_rollno=?1 AND stud_password=?2" )
	  student findByRollnoAndPassword(int stud_rollno, String stud_password);
	 
	  @Query("select s from student s where stud_email=?1")
	  student findByStudEmail(String stud_email);
	  
		/* student findBystud_rollnoAndPassword(int stud_rollno,String password); */
	  
	  
		/*
		 * public static final String FIND_PROJECTS = "SELECT stud_fname FROM projects";
		 * 
		 * @Query(value = FIND_PROJECTS, nativeQuery = true) public Student<Object[]>
		 * findProjects();
		 */
	  
	  
	
}
