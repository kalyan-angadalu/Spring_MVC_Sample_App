package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
@Autowired
	private UserRepo repo;
@PostMapping("/login")
public String loginCheck(@RequestParam String email,
                         @RequestParam String password,
                         Model model) {

    System.out.println("Entered Email: " + email);
    System.out.println("Entered Password: " + password);

    User user = repo.findByEmail(email);

    System.out.println("DB User: " + user);

    if(user != null &&
       user.getPassword().trim().equals(password.trim())) {

        System.out.println("Login Success");

        return "success";
    }
    else {

        System.out.println("Login Failed");

        return "login";
    }
}
}
