package co.grandcircus.GCUniversity;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.GCUniversity.entity.Admin;
import co.grandcircus.GCUniversity.entity.AdminDao;
import co.grandcircus.GCUniversity.entity.CourseDao;

@Controller
public class AdminController {

	@Autowired
	private AdminDao adminDao;
	private CourseDao courseDao;

	@RequestMapping("/adminlogin")
	public ModelAndView admin(@RequestParam(name = "username", required = true) String username, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		    ModelAndView mv = new ModelAndView("adminlogin");

		mv.addObject("username", adminDao.findAll());
		return mv;

	}
	
	@RequestMapping("/courselist")
	public ModelAndView showCourses () {
		    ModelAndView mv = new ModelAndView("admin-course-list");

		mv.addObject("course", courseDao.findAll());
		return mv;
		
	}

}
