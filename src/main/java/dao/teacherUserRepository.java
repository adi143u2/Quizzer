package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Teacher;

public interface teacherUserRepository extends JpaRepository<Teacher, Integer> {

	
	
	
	/*
	 * @Query("select s from Teacher s where teacher_email=?1 AND teacher_password=?2"
	 * ) Teacher findByUsernameAndPassword(String teacher_email, String
	 * teacher_password);
	 */
	
	
	
	@Query("select t from Teacher t where teacher_username=?1 AND teacher_password=?2")
	
	Teacher findByUsernameAndPassword(String teacher_username,String teacher_password);

	@Query("select t from Teacher t where teacher_email=?1")
	Teacher findByTeacherEmail(String teacher_email);

}
