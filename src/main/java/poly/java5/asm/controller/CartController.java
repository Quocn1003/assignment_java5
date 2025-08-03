package poly.java5.asm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import poly.java5.asm.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") String id, HttpSession session) {
        cartService.addToCart(session, id, 1);
        return "redirect:/cart/view";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable("id") String id, HttpSession session) {
        cartService.removeFromCart(session, id);
        return "redirect:/cart/view";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") String id, @RequestParam("qty") int qty, HttpSession session) {
        cartService.addToCart(session, id, qty);
        return "redirect:/cart/view";
    }

    @GetMapping("/clear")
    public String clear(HttpSession session) {
        cartService.clearCart(session);
        return "redirect:/cart/view";
    }

    @GetMapping("/view")
    public String view() {
        return "cart";
    }
}
