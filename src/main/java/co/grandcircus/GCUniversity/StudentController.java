package co.grandcircus.GCUniversity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/student-home")
	public ModelAndView student() {
		return new ModelAndView("student-home");

	}

}
