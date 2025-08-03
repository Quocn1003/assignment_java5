package poly.java5.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/checkout")
    public String checkout() {
        // orderService.checkout();
        return "check-out";
    }

    @GetMapping("/list")
    public String list() {
        return "order-list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id) {
        return "order-detail";
    }

    @GetMapping("/my-product-list")
    public String myProductList() {
        return "my-product-list";
    }
}