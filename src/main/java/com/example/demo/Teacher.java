package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacherDetails")
public class Teacher {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacher_id;
	private String teacher_fname;
	private String teacher_lname;
	private String teacher_email;
	private String teacher_password;
	private boolean is_active;
	
	
	
	
	
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Teacher(String teacher_fname, String teacher_lname, String teacher_email, String teacher_password,
			boolean is_active) {
		super();
		this.teacher_fname = teacher_fname;
		this.teacher_lname = teacher_lname;
		this.teacher_email = teacher_email;
		this.teacher_password = teacher_password;
		this.is_active = is_active;
	}
	
	
	
	public Teacher(int teacher_id, String teacher_fname, String teacher_lname, String teacher_email,
			String teacher_password, boolean is_active) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_fname = teacher_fname;
		this.teacher_lname = teacher_lname;
		this.teacher_email = teacher_email;
		this.teacher_password = teacher_password;
		this.is_active = is_active;
	}
	
	
	
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}
	public String getTeacher_lname() {
		return teacher_lname;
	}
	public void setTeacher_lname(String teacher_lname) {
		this.teacher_lname = teacher_lname;
	}
	public String getTeacher_email() {
		return teacher_email;
	}
	public void setTeacher_email(String teacher_email) {
		this.teacher_email = teacher_email;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	
	
	
	
	
	
}
