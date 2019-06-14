package cn.jerry.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	@RequestMapping("/")
	public String hello(Model model){
		model.addAttribute("message", "hello world");
		return "hello";
	}

}
