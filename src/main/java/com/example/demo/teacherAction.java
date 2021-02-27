package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/teacher")
public class teacherAction {
	
	
	@Autowired
	private teacherUserRepository TeacherUserRepository;
	
	
	
	
	@PostMapping("/teach_register")
	public String teacher_Register(String teacher_fname,String teacher_lname,String teacher_email,String teacher_password)
	{
		
		Teacher teacherDetail = new Teacher(teacher_fname,teacher_lname,teacher_email,teacher_password, true);
		TeacherUserRepository.save(teacherDetail);
		return "Teacher Registration Successfull";
	}

	
	@RequestMapping(value = "/Teacher_register" , method = RequestMethod.POST)
	public String teacherRegister(Teacher teacher)
	{
		
		Teacher teacherDetail = new Teacher(teacher.getTeacher_fname(),teacher.getTeacher_lname(),teacher.getTeacher_email(),teacher.getTeacher_password(), true);
		TeacherUserRepository.save(teacherDetail);
		return "Teacher Registration Successfull";
	}

	@GetMapping("/T_register")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacher_register");
		return mv;
	}
	
	
	
	
	@GetMapping("/teacherLogin")
	public Teacher TeacherLogin(String teacher_email, String teacher_password)
	{
		
		Teacher obj = TeacherUserRepository.findByUsernameAndPassword(teacher_email, teacher_password);
		
		return obj;
	}
	
	
}
