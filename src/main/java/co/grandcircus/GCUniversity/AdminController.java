package co.grandcircus.GCUniversity;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.GCUniversity.entity.AdminDao;
import co.grandcircus.GCUniversity.entity.Course;
import co.grandcircus.GCUniversity.entity.CourseDao;

@Controller
public class AdminController {

	@Autowired
	private AdminDao adminDao;
	@Autowired
	private CourseDao courseDao;

	@RequestMapping("/admin")
	public ModelAndView admin(@RequestParam(name = "username", required = true) String username,
			@RequestParam("password") String password, HttpSession session, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView("admin");

		mv.addObject("username", adminDao.findAll());
		return mv;

	}

	@RequestMapping("/admin-course-list")
	public ModelAndView showCourses() {
		List<Course> list = courseDao.findAll();
		return new ModelAndView("admin-course-list", "courses", list);

	}

}
