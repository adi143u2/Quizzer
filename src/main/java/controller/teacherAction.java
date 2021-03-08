package controller;
import dao.teacherUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import dao.teacherUserRepository;
import model.Teacher;

@RestController
@RequestMapping("/teacher")
public class teacherAction {

	@Autowired
	private teacherUserRepository TeacherUserRepository;

	@PostMapping("/teach_register")
	public String teacher_Register(String teacher_fname, String teacher_lname, String teacher_username,
			String teacher_email, String teacher_password) {

		Teacher teacherDetail = new Teacher(teacher_fname, teacher_lname, teacher_username, teacher_email,
				teacher_password, true);
		TeacherUserRepository.save(teacherDetail);
		return "Teacher Registration Successfull";
	}

	@RequestMapping(value = "/teacher_register", method = RequestMethod.POST)
	public ModelAndView teacherRegister(Teacher teacher) {

		Teacher teacherDetail = new Teacher(teacher.getTeacher_fname(), teacher.getTeacher_lname(),
				teacher.getTeacher_username(), teacher.getTeacher_email(), teacher.getTeacher_password(), true);
		TeacherUserRepository.save(teacherDetail);
		ModelAndView mv = new ModelAndView("teacherLogin");
		mv.addObject("q", "0");
		return mv;
		
	}

	@GetMapping("/teacher_register")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherRegister");
		return mv;
	}

	/*
	 * IMPORTANT QUERY (DO NOT DELETE)
	 * 
	 * @GetMapping("/teacherLogin") public Teacher TeacherLogin(String
	 * teacher_email, String teacher_password) {
	 * 
	 * Teacher obj = TeacherUserRepository.findByUsernameAndPassword(teacher_email,
	 * teacher_password);
	 * 
	 * return obj; }
	 */

	@RequestMapping(value = "/teacher_login", method = RequestMethod.POST)
	public ModelAndView TeacherLoginData(Teacher teacher) {

		Teacher obj = TeacherUserRepository.findByUsernameAndPassword(teacher.getTeacher_username(),
				teacher.getTeacher_password());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherDashboard");
		mv.addObject("teacher", obj);
		return mv;
	}

	@GetMapping("/T_Login")
	public Teacher TLoginData(String teacher_username, String teacher_password) {

		Teacher obj = TeacherUserRepository.findByUsernameAndPassword(teacher_username, teacher_password);
		/*
		 * ModelAndView mv = new ModelAndView(); mv.setViewName("teacher_dashboard");
		 * mv.addObject("teacher", obj);
		 */
		return obj;
	}

	@GetMapping("/teacher_login")
	public ModelAndView teacherLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherLogin");
		return mv;
	}

	@GetMapping("/teacher_password")
	public ModelAndView teacherPassword() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherPassword");
		return mv;
	}

	@RequestMapping(value = "/teacher_mailverify", method = RequestMethod.POST)
	public ModelAndView teachermailVerify(Teacher teacher) {

		Teacher obj = TeacherUserRepository.findByTeacherEmail(teacher.getTeacher_email());

		if (obj != null) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("tp");
			mv.addObject("teacher", obj);
			return mv;

		} else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("teacherPassword");
			mv.addObject("q", "0");
			return mv;
		}
	}

	@GetMapping("/teacher_newquiz")
	public ModelAndView teacherQuiz() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("newQuiz");
		return mv;
	}

}
