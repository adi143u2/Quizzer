package controller;

import java.util.Random;
import dao.studentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.student;

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

	/*
	 * @PostMapping("/studregister1") public String REG(String stud_fname, String
	 * stud_lname, String stud_email, String stud_mobile, String stud_pass) { Random
	 * rand = new Random(); int randomNo = rand.nextInt(1000); String RANDOM =
	 * String.valueOf(randomNo);
	 * 
	 * Student student = new Student(randomNo, stud_fname, stud_lname, stud_email,
	 * stud_mobile, stud_pass, true);
	 * 
	 * StudentUserRepository.save(student);
	 * 
	 * return " Student Registration Successfull"; }
	 */

	@RequestMapping(value = "/studregister2", method = RequestMethod.POST)
	public ModelAndView REGISTER(student student) {
		Random rand = new Random();
		int randomNo = rand.nextInt(1000);
		String RANDOM = String.valueOf(randomNo);

		student st = new student(randomNo, student.getStud_fname(), student.getStud_lname(), student.getStud_email(),
				student.getStud_mobile(), student.getStud_password(), true);

		StudentUserRepository.save(st);

		ModelAndView mv = new ModelAndView("studentLogin");
		mv.addObject("q", "0");
		return mv;
	}

	@GetMapping("/stud_register")
	public ModelAndView reg() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentRegister");
		return mv;
	}

	@GetMapping("/stud_login")
	public ModelAndView studLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentLogin");
		return mv;
	}

	@GetMapping("/{stud_rollno}")
	public student getStudent(@PathVariable int stud_rollno) {
		return StudentUserRepository.findById(stud_rollno).get();
	}

	/*
	 * @PostMapping("/stud_details")
	 * 
	 * @Query("select stud_fname from Student where stud_rollno=:stud_rollno AND stud_password=:stud_password"
	 * ) public ModelAndView afetrLogin(int stud_rollno, String stud_password) {
	 * 
	 * ModelAndView mv = new ModelAndView(); return mv; }
	 */

	
	// Running Please Uncomment (YAAD RAKHIYO)
	  @GetMapping("/studentLogin") 
	  public student StudentLogin(int stud_rollno, String stud_password) { 
	
		  student obj= StudentUserRepository.findByRollnoAndPassword(stud_rollno,
	  stud_password); 
		  return obj;
		  }
	 
//new 
	  @RequestMapping(value = "/student_dashboard", method = RequestMethod.POST)
		public ModelAndView studLoginData(student Student) {
		  
		  
		  student obj= StudentUserRepository.findByRollnoAndPassword(Student.getStud_rollno(),
				  Student.getStud_password()); 
		  
		 
			ModelAndView mv = new ModelAndView();
			mv.setViewName("studentDashboard");
			mv.addObject("student",obj);
			return mv;
		
		}
	  
	  
	  @GetMapping("/stud_forgetpass")
		public ModelAndView stud_forgetPass() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("studentPassword");
			return mv;
		}
	  
	  

	  
	  
	  
	  @RequestMapping(value = "/student_mailverify", method = RequestMethod.POST)
		public ModelAndView studmailVerify(student Student) {
		  
		  student obj = StudentUserRepository.findByStudEmail(Student.getStud_email());
		  
		 if(obj!=null)
		 {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("tp");
			mv.addObject("student",obj);
			return mv;
		 }
		 else
		 {
			 ModelAndView mv = new ModelAndView();
				mv.setViewName("studentPassword");
				mv.addObject("q","0");
				return mv;
		 }
		}
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	/*
	 * @GetMapping("/student_LoginbyId") public student StudentloginByRollno(int
	 * stud_rollno, String stud_password) {
	 * 
	 * student obj1 =
	 * StudentUserRepository.findBystud_rollnoAndPassword(stud_rollno,
	 * stud_password); return obj1;
	 * 
	 * }
	 */

}
