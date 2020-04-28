package com.example.bmdb.web.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bmdb.domain.Media;
import com.example.bmdb.service.MediaService;

@Controller
public class GetDateAndTimeController {
	
	@Autowired
	MediaService mediaService;
	
	@RequestMapping(value = "/getDateAndTime")
    public ModelAndView getDateAndTime() {

        var now = LocalDateTime.now();
        var dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var date_time = dtf.format(now);
        
        Media media = mediaService.findAllMedia().get(0);
        var params = new HashMap<String, Object>();
        params.put("date_time", date_time);
        params.put("media", media.getTitle());
        
        return new ModelAndView("showMessage.jsp", params);
	}
}
