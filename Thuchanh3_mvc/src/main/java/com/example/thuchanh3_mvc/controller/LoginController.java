package com.example.thuchanh3_mvc.controller;

import com.example.thuchanh3_mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    // Hiển thị form
    @GetMapping("/login")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    // Xử lý form
    @PostMapping("/login")
    public String processLogin(@ModelAttribute("user") User user, Model model) {
        // Tài khoản mẫu
        String validUsername = "admin";
        String validPassword = "123";

        if (user.getUsername().equals(validUsername) && user.getPassword().equals(validPassword)) {
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
        }

        return "login";
    }
}
