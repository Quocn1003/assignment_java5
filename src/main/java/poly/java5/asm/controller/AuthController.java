package poly.java5.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpSession;
import poly.java5.asm.service.AuthService;

@Controller
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping("/auth/login")
    public String login() {
        return "login"; // Hien thi form dang nhap
    }

    @PostMapping("/auth/login")
    public String login(String username, String password, HttpSession session, Model model) {

        if (authService.login(username, password)) {
            session.setAttribute("username", username);
            session.setAttribute("isAdmin", authService.isAdmin(username)); // Kiem tra quyen admin

            // Tra ve duong dan ve trang truoc do neu co
            String redirectUri = (String) session.getAttribute("redirect-uri");
            if (redirectUri != null) {
                session.removeAttribute("redirect-uri"); // Xoa redirect-uri sau khi da su dung
                return "redirect:" + redirectUri; // Chuyen huong ve trang truoc do
            }
            return "redirect:/home/index"; // Chuyen huong den trang quan tri
        } else {
            model.addAttribute("message", "Sai tài khoản hoặc mật khẩu!"); // Thong bao loi dang nhap
            return "login"; // Tro ve trang dang nhap
        }
    }

    @GetMapping("/auth/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // Xoa session
        return "redirect:/auth/login"; // Chuyen huong ve trang dang nhap
    }
}
