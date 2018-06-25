package io.tatai.demo.adminlteiframetab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController{

	@RequestMapping(value = "/home", method= RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping(value = "/welcome", method= RequestMethod.GET)
	public ModelAndView welcome(){
		ModelAndView mv = new ModelAndView("welcome");
		return mv;
	}

	@RequestMapping(value = "/test1", method= RequestMethod.GET)
	public ModelAndView test1(){
		ModelAndView mv = new ModelAndView("test1");
		return mv;
	}

	@RequestMapping(value = "/test2", method= RequestMethod.GET)
	public ModelAndView test2(){
		ModelAndView mv = new ModelAndView("test2");
		return mv;
	}

	@RequestMapping(value = "/test3", method= RequestMethod.GET)
	public ModelAndView test3(){
		ModelAndView mv = new ModelAndView("test3");
		return mv;
	}

	@RequestMapping(value = "/test4", method= RequestMethod.GET)
	public ModelAndView test4(){
		ModelAndView mv = new ModelAndView("test4");
		return mv;
	}
}
