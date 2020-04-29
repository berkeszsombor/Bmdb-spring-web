package com.example.bmdb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.bmdb.domain.User;
import com.example.bmdb.service.UserService;

@Controller
public class LoginFormController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
		ModelAndView model;
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		User foundUser = userService.findUserByCred(email, password);
		if(foundUser == null) {
			return "redirect:errorLogin";
		}
		else {
			return "redirect:home";
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("/login.jsp");
		return model;
	}
}
