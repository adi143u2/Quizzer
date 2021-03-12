package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import dao.feedbackRepository;
import dao.studentUserRepository;
import dao.feedbackRepository;
import model.student;
import model.feedback;

@RestController
@RequestMapping("/")
public class IndexMappingAction {

	

	@Autowired
	private feedbackRepository FeedbackRepository;
	
	@GetMapping("/aboutus")
	public ModelAndView aboutus() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aboutUs");
		return mv;
	}
	
	@GetMapping("/feedback")
	public ModelAndView feedback() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("feedback");
		return mv;
	}

	
	
	
	@RequestMapping(value = "/feedbackData", method = RequestMethod.POST)
	public String feedbackData(feedback Feedback) {
	  
	  
		FeedbackRepository.save(Feedback);
	  
	 
		ModelAndView mv = new ModelAndView();
		
		return "Feedback SAved Successfully";
	
	}
	
	
	

	
}
