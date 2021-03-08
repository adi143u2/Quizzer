package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class question {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  que_id;
	private String que_question;
	private String exam_id;
	private String que_opt1;
	private String que_opt2;
	private String que_opt3;
	private String que_opt4;
	private String que_correctopt;
	private String que_difficulty;
	
	
	
	
	
	
	
	
	
	public String getQue_difficulty() {
		return que_difficulty;
	}
	public void setQue_difficulty(String que_difficulty) {
		this.que_difficulty = que_difficulty;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public question(String que_question, String exam_id, String que_opt1, String que_opt2, String que_opt3,
			String que_opt4, String que_correctopt,String que_difficulty) {
		super();
		this.que_question = que_question;
		this.exam_id = exam_id;
		this.que_opt1 = que_opt1;
		this.que_opt2 = que_opt2;
		this.que_opt3 = que_opt3;
		this.que_opt4 = que_opt4;
		this.que_correctopt = que_correctopt;
		this.que_difficulty= que_difficulty;
	}
	public question(int que_id, String que_question, String exam_id, String que_opt1, String que_opt2, String que_opt3,
			String que_opt4, String que_correctopt,String que_difficulty) {
		super();
		this.que_id = que_id;
		this.que_question = que_question;
		this.exam_id = exam_id;
		this.que_opt1 = que_opt1;
		this.que_opt2 = que_opt2;
		this.que_opt3 = que_opt3;
		this.que_opt4 = que_opt4;
		this.que_correctopt = que_correctopt;
		this.que_difficulty= que_difficulty;
	}
	public int getQue_id() {
		return que_id;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public String getQue_question() {
		return que_question;
	}
	public void setQue_question(String que_question) {
		this.que_question = que_question;
	}
	public String getExam_id() {
		return exam_id;
	}
	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}
	public String getQue_opt1() {
		return que_opt1;
	}
	public void setQue_opt1(String que_opt1) {
		this.que_opt1 = que_opt1;
	}
	public String getQue_opt2() {
		return que_opt2;
	}
	public void setQue_opt2(String que_opt2) {
		this.que_opt2 = que_opt2;
	}
	public String getQue_opt3() {
		return que_opt3;
	}
	public void setQue_opt3(String que_opt3) {
		this.que_opt3 = que_opt3;
	}
	public String getQue_opt4() {
		return que_opt4;
	}
	public void setQue_opt4(String que_opt4) {
		this.que_opt4 = que_opt4;
	}
	public String getQue_correctopt() {
		return que_correctopt;
	}
	public void setQue_correctopt(String que_correctopt) {
		this.que_correctopt = que_correctopt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
