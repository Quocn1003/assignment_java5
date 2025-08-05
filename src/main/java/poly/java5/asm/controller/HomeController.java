package poly.java5.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import poly.java5.asm.service.ProductService;

@Controller
public class HomeController {
    @Autowired
    ProductService productService;

    @GetMapping("/home/index")
    public String home(Model model) {
        model.addAttribute("products", productService.findAll()); // lay tat cả sản phẩm
        return "home";
    }
}