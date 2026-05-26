package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerPage {
	@Autowired
private RegisterRepository repo;
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/form")
public String showForm(Model model)
{
		model.addAttribute("register", new Register());
	return "Signup";
}
	@PostMapping("/register")
	public String save(@ModelAttribute Register register)
	{
	    // Save into Register table
	    repo.save(register);

	    // Save into User table
	    User user = new User();

	    user.setEmail(register.getEmail());
	    user.setPassword(register.getPassword());

	    userRepo.save(user);

	    return "Login";
	}
	
	

}
