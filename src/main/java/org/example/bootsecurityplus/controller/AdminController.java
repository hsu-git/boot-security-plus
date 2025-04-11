package org.example.bootsecurityplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/a")
    public String a(Model model) {
        model.addAttribute("msg", "a-admin");
        return "index";
    }

    @GetMapping("/b")
    public String b(Model model) {
        model.addAttribute("msg", "b-admin");
        return "index";
    }
}