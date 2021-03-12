package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class feedback {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fed_id;
	private String fed_fname;
	private String fed_lname;
	private String fed_email;
	private String fed_country;
	private String fed_feedback;
	
	
	
	
	
	public int getFeeback_id() {
		return fed_id;
	}
	public void setFeeback_id(int feeback_id) {
		this.fed_id = feeback_id;
	}
	public String getFed_fname() {
		return fed_fname;
	}
	public void setFed_fname(String fed_fname) {
		this.fed_fname = fed_fname;
	}
	public String getFed_lname() {
		return fed_lname;
	}
	public void setFed_lname(String fed_lname) {
		this.fed_lname = fed_lname;
	}
	public String getFed_email() {
		return fed_email;
	}
	public void setFed_email(String fed_email) {
		this.fed_email = fed_email;
	}
	public String getFed_country() {
		return fed_country;
	}
	public void setFed_country(String fed_country) {
		this.fed_country = fed_country;
	}
	public String getFed_feedback() {
		return fed_feedback;
	}
	public void setFed_feedback(String fed_feedback) {
		this.fed_feedback = fed_feedback;
	}
	
	
	public feedback(String fed_fname, String fed_lname, String fed_email, String fed_country, String fed_feedback) {
		super();
		this.fed_fname = fed_fname;
		this.fed_lname = fed_lname;
		this.fed_email = fed_email;
		this.fed_country = fed_country;
		this.fed_feedback = fed_feedback;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
