package com.examples.spring.web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.web.mvc.exception.LoginException;
import com.examples.spring.web.mvc.model.Login;
import com.examples.spring.web.mvc.model.User;
@Controller
@SessionAttributes("userName,password")
public class RegisterController {
	
@RequestMapping(value = "/register", method = RequestMethod.GET)
public String register(Model model) {
	model.addAttribute("user",new User());
	return "register";
	
}
		
		
@RequestMapping(value = "/register", method = RequestMethod.POST)	
		public String authenticate(@ModelAttribute @Valid User user,BindingResult result, Model model, HttpSession session) {
			
			if(result.hasErrors())
			{
//				logger.info("Authentication success");
//				session.setAttribute("userName", login.getUserName());
				//model.addAttribute("userName", "admin");
				return "register";
			}
			else
			{
               session.setAttribute("userName",user.getUserName());
               session.setAttribute("password",user.getPassword());
               return "registrationsuccess";
               
               
			}
			
		}	
		
//		public List<Login> getUsers()
//		{
//			List<Login> users = new ArrayList<Login>();
//			users.add(new Login("admin","admin@123"));
//			users.add(new Login("manager", "manager@123"));
//			users.add(new Login("user", "user@123"));
//		
//			return users;
//		}
//		
		
//		@RequestMapping(value = "/logout", method = RequestMethod.GET)
//		public String logout(HttpSession session, SessionStatus sessionStatus)
//		{		
//			sessionStatus.setComplete();
////			session.removeAttribute("userName");		
////			session.invalidate();
//			return "redirect:/";
//		}
}
