package poly.java5.asm.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.entity.Account;
import poly.java5.asm.service.AccountService;

@Controller
@RequestMapping("/admin/account")
public class AccountAController {

    @Autowired
    AccountService accountService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "account";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, Model model) {
        model.addAttribute("account", accountService.findByUsername(id));
        return "account";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        accountService.deleteByUsername(id);
        return "redirect:/admin/account/index";
    }

    @PostMapping("/create")
    public String create(Account account) {
        accountService.save(account);
        return "redirect:/admin/account/index";
    }

    @PostMapping("/update")
    public String update(Account account) {
        accountService.save(account);
        return "redirect:/admin/account/index";
    }
}
