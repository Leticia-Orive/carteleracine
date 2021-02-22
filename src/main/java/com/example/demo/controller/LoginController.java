package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin(Model model) {
	model.addAttribute(new User());
	return "login";

}
@PostMapping("/login")
public String login(@ModelAttribute User user, HttpSession session) {
	session.setAttribute("user",user);
	return "";
}
}
	
