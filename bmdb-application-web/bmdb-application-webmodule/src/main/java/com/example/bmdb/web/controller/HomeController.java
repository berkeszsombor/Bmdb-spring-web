package com.example.bmdb.web.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.bmdb.domain.Review;
import com.example.bmdb.service.ReviewService;
import com.example.bmdb.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	@Autowired
	ReviewService reviewService;
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public void home(@RequestParam("email") String email, @RequestParam("name") String name) {
		//User oldUser = userService.findUserByEmail(email);
		//User newUser = oldUser;
		//newUser.setEmail(email);
		//newUser.setName(name);
		//newUser.setPassword(oldUser.getPassword());
		//userService.deleteByEmail(email);
		//userService.saveUser(newUser);
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home() {
		var params = new HashMap<String, Object>();
		List<Review> reviews = reviewService.findAllReview();
		params.put("reviews", reviews);
		return new ModelAndView("home.jsp", params);
	}
}
