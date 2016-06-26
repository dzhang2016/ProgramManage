package com.domi.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.domi.model.Program;

@Controller
@SessionAttributes("program")
public class ProgramController {

	@RequestMapping(value = "addProgram", method = RequestMethod.GET)
	public String addProgram(Model model) {
		Program program = new Program();
		program.setName("basic program");;
		model.addAttribute("program", program);
		
		return "addProgram";
	}
	
	@RequestMapping(value = "addProgram", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("program") Program program, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("Program set: " + program.getName());
		
		if(result.hasErrors()) {
			return "addProgram";
		}
		
		return "redirect:index.jsp";
	}
	
}
