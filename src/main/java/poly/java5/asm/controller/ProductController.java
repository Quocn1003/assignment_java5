package poly.java5.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list-by-category/{id}")
    public String listByCategory(@PathVariable("id") Long id, Model model) {
        model.addAttribute("products", productService.findByCategoryId(id));
        return "product-list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product-detail";
    }
}
