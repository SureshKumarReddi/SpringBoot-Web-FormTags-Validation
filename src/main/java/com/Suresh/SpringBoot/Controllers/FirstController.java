package com.Suresh.SpringBoot.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Suresh.SpringBoot.Models.Student;

@Controller
public class FirstController {


	@RequestMapping("/loadform")
	public String loadForms(Model model) {
		
		Student studObj = new Student();
		model.addAttribute("student", studObj);
		return "index";
	}
	
	@RequestMapping("/showform")
	public String goToSuccess(@Valid @ModelAttribute("student")Student stud,BindingResult br) {
		
		 if(br.hasErrors())  
	        {  
	            return "index";  
	        }  
	        else  
	        {  
	        return "success";  
	        }
	}
}
