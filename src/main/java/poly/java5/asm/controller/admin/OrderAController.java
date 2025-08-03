package poly.java5.asm.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.entity.Order;
import poly.java5.asm.service.OrderService;

@Controller
@RequestMapping("/admin/order")
public class OrderAController {

    @Autowired
    OrderService orderService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("orders", orderService.findAll());
        return "order";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("order", orderService.findById(id));
        return "order";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        orderService.deleteById(id);
        return "redirect:/admin/order/index";
    }

    @PostMapping("/create")
    public String create(Order order) {
        orderService.save(order);
        return "redirect:/admin/order/index";
    }

    @PostMapping("/update")
    public String update(Order order) {
        orderService.updateById(order.getId(), order);
        return "redirect:/admin/order/index";
    }
}
