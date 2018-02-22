package com.hk.answerboard.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hk.answerboard.dtos.AnswerDto;
import com.hk.answerboard.service.IAnsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IAnsService answerService;
<<<<<<< HEAD:src/main/java/com/hk/answerboard/controller/HomeController.java
=======
	
>>>>>>> 57f35aef3106ea06f60a4e9f57dd2d0070bc8f0b:src/main/java/com/hk/answerboard/controller/HomeController.java
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
<<<<<<< HEAD:src/main/java/com/hk/answerboard/controller/HomeController.java
	@RequestMapping(value="/insertboard.do")
	public String insertboard(AnswerDto dto) {
		boolean isS=answerService.insertBoard(dto);
		if (isS) {
			return "redirect:boardlist.do";
		} else {
			return "insertboard";
		}
	}
	@RequestMapping(value="/insertform.do")
	public String insertform(Locale locale) {
		return "insertboard";
	}
=======
	
	@RequestMapping(value = "/boardlist.do", method = RequestMethod.GET)
	public String boardlist(Model model,Locale locale) {
		
		logger.info("모든 게시글을 가져옵니다.");
				
		List<AnswerDto> lists =answerService.getAllList();
				
		
		model.addAttribute("lists", lists);
		
		return "boardlist";
	}
	
>>>>>>> 57f35aef3106ea06f60a4e9f57dd2d0070bc8f0b:src/main/java/com/hk/answerboard/controller/HomeController.java
}
