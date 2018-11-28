package co.grandcircus.GCUniversity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GcUniversityController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		 return new ModelAndView("index");
	
	}
	
	@RequestMapping
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	
	
	
	
}