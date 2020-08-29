package com.example.springwebexapplication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springwebexapplication.model.Answer1;
import com.example.springwebexapplication.model.User;
import com.example.springwebexapplication.service.AnswerService;
import com.example.springwebexapplication.service.LoginService;
import com.example.springwebexapplication.service.QuestionService;


@Controller
public class LoginController {
	

	//private static final Answer1 Answer1 = null;
	//	private static final Answer1 Answer1 = null;
	@Autowired
	LoginService loginService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;


	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showVeiwUserDetails(ModelMap model){
		return "first"; 
    }
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String login11(ModelMap model) {
        return "login";
    }
	
	
	@RequestMapping("/userRegistration")    
    public String showform(ModelMap model){    
		model.put("command", new User());  
        return "userRegistration";   
    }    
	
	@RequestMapping(value="/success", method = RequestMethod.POST)
    public String login1(ModelMap model) {
        return "success";
    }
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "welcome";
    }
	@RequestMapping(value="/answer", method = RequestMethod.GET)
    public String question(ModelMap model) {
        return "answer";
    }
	

	@RequestMapping(value="/addUserDetails", method = RequestMethod.POST)
    public String addUserDetails(@ModelAttribute("user") User user) {
		User newUser =  loginService.save(user);
		if(newUser != null){
			return "success";
		}else{
			return "redirect:/userRegistration";
		}
    }

	
	@RequestMapping(value="/verifyLoginDetails", method = RequestMethod.GET)
    public String validateAdmin(ModelMap model, @RequestParam String username, @RequestParam String password){
		System.out.println("Entering - LoginController.validateUser(ModelMap, String, String) - username : "+username+" | password : "+password);
        boolean isValidUser = loginService.validateUser(username, password);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("username", username);
        return "welcome";
    }
	
	@GetMapping("/question")
	public String index1(ModelMap modelMap){
		modelMap.put("question",questionService.findAll());
	return "question"; 
	}	
/*	@RequestMapping(value = "/answersave", method = RequestMethod.POST)
	public String index(ModelMap modelMap){
		Answer1 Answer1 = null;
		modelMap.put("answer",answerService.save(Answer1));
	return "welcome"; 
	}/*
	*/
	@PostMapping(value="/answersave")
    public String saverequest(@ModelAttribute Answer1 answer1,BindingResult bindingResult,HttpServletRequest request) {
		//Answer1 answer11 = null;
		Answer1 newAnswer = answerService.save(answer1);
    return "welcome";
    }
	
	
}
