package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class IndexMappingAction {

	
	
	
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


	
}
