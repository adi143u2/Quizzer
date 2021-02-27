package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(name="student") 
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stud_id;
	private int stud_rollno;
	private String stud_fname;
	private String stud_lname;
	private String stud_email;
	private String stud_mobile;
	private String stud_password;
	private boolean is_active;
	
	
	
	
	
	
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getStud_mobile() {
		return stud_mobile;
	}


	public void setStud_mobile(String stud_mobile) {
		this.stud_mobile = stud_mobile;
	}


	public student(int stud_id, int stud_rollno, String stud_fname, String stud_lname,String stud_email,String stud_mobile, String stud_password,
			boolean is_active) {
		super();
		this.stud_id = stud_id;
		this.stud_rollno = stud_rollno;
		this.stud_fname = stud_fname;
		this.stud_lname = stud_lname;
		this.stud_email = stud_email;
		this.stud_mobile = stud_mobile;
		this.stud_password = stud_password;
		this.is_active = is_active;
	}
	
	
	public student(int stud_rollno, String stud_fname, String stud_lname,String stud_email, String stud_mobile, String stud_password, boolean is_active) {
		super();
		this.stud_rollno = stud_rollno;
		this.stud_fname = stud_fname;
		this.stud_lname = stud_lname;
		this.stud_email = stud_email;
		this.stud_mobile = stud_mobile;
		this.stud_password = stud_password;
		this.is_active = is_active;
	}
	
	
	
	
	public String getStud_email() {
		return stud_email;
	}


	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}


	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public int getStud_rollno() {
		return stud_rollno;
	}
	public void setStud_rollno(int stud_rollno) {
		this.stud_rollno = stud_rollno;
	}
	public String getStud_fname() {
		return stud_fname;
	}
	public void setStud_fname(String stud_fname) {
		this.stud_fname = stud_fname;
	}
	public String getStud_lname() {
		return stud_lname;
	}
	public void setStud_lname(String stud_lname) {
		this.stud_lname = stud_lname;
	}
	public String getStud_password() {
		return stud_password;
	}
	public void setStud_password(String stud_password) {
		this.stud_password = stud_password;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	
	

	
	
	
}
