package com.lei.demo.controller;

import javax.annotation.Resource;

import com.lei.demo.entity.User;
import com.lei.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/manager",method=RequestMethod.GET)
	public ModelAndView hello2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "HelloMVC");
		mv.setViewName("users");
		return mv;
	}

	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView toCreate(){
		ModelAndView mv = new ModelAndView();
		User user = new User();
		mv.addObject("message", "新增用户！");
		mv.addObject("user",user);
		mv.setViewName("edit");
		return mv;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(User user){
		//userService.createUser(user);
		ModelAndView mv = new ModelAndView();
		/*User user = new User();
		mv.addObject("message", "新增用户成功！");
		mv.addObject("user",user);
		mv.setViewName("edit");*/
		return mv;
	}
	
	@RequestMapping(value="/count",method=RequestMethod.GET)
	public ModelAndView count(){
		
		int c = userService.userCount();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", c);
		mv.setViewName("users");
		return mv;
	}
}


