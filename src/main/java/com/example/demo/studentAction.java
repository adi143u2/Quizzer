package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/student")
public class studentAction {

	@Autowired
	private studentUserRepository StudentUserRepository;

	/*
	 * @GetMapping("/stud_register") public String Register(String stud_fname,String
	 * stud_lname,String stud_email,String stud_mobile,String stud_pass) { Random
	 * rand = new Random(); int randomNo = rand.nextInt(1000); String
	 * RANDOM=String.valueOf(randomNo);
	 * 
	 * Student student = new Student(randomNo, stud_fname,
	 * stud_lname,stud_email,stud_mobile, stud_pass, true);
	 * 
	 * StudentUserRepository.save(student);
	 * 
	 * return "Get Method Student Registration  Successfull"; }
	 */

	@PostMapping("/studregister1")
	public String REG(String stud_fname, String stud_lname, String stud_email, String stud_mobile, String stud_pass) {
		Random rand = new Random();
		int randomNo = rand.nextInt(1000);
		String RANDOM = String.valueOf(randomNo);

		Student student = new Student(randomNo, stud_fname, stud_lname, stud_email, stud_mobile, stud_pass, true);

		StudentUserRepository.save(student);

		return " Student Registration Successfull";
	}

	@RequestMapping(value = "/studregister2", method = RequestMethod.POST)
	public String REGISTER(Student student) {
		Random rand = new Random();
		int randomNo = rand.nextInt(1000);
		String RANDOM = String.valueOf(randomNo);

		Student st = new Student(randomNo, student.getStud_fname(), student.getStud_lname(), student.getStud_email(),
				student.getStud_mobile(), student.getStud_password(), true);

		StudentUserRepository.save(st);

		return " Student Registration Successfull";
	}

	@GetMapping("/stud_register")
	public ModelAndView reg() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student_Register");
		return mv;
	}

	@GetMapping("/stud_login")
	public ModelAndView studLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("stud_login");
		return mv;
	}

	
	  @GetMapping("/{stud_rollno}") public Student getStudent(@PathVariable int
	  stud_rollno) { return StudentUserRepository.findById(stud_rollno).get(); }
	 

		/*
		 * @PostMapping("/stud_details")
		 * 
		 * @Query("select stud_fname from Student where stud_rollno=:stud_rollno AND stud_password=:stud_password"
		 * ) public ModelAndView afetrLogin(int stud_rollno, String stud_password) {
		 * 
		 * ModelAndView mv = new ModelAndView(); return mv; }
		 */
	  
	  
	  
	  
	  
	  
	  
}
