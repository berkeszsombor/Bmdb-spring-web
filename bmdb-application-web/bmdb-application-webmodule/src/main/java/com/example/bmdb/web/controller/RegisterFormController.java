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
public class RegisterFormController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,@RequestParam("name") String name, @RequestParam("password") String password) {
		ModelAndView model;
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		userService.saveUser(user);
		
		return "redirect:home";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("/register.jsp");
		return model;
	}
}
