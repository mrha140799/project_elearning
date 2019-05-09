package com.elearning.controllers;

import com.elearning.model.User;
import com.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @PostMapping("/dangki/success")
    public String xuLyDangKi(@ModelAttribute("user") User user , RedirectAttributes redirect, Model model) {
        if (!user.getName().equals("") && !user.getEmail().equals("")) {
            model.addAttribute("message","Đăng kí thành Công!");
            userService.save(user);
        }else {
            model.addAttribute("message","Đăng kí không thành Công!");

        }
        return "/home";
    }
}
