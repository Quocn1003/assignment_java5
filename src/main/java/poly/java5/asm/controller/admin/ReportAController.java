package poly.java5.asm.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.service.ReportService;

@Controller
@RequestMapping("/admin/report")
public class ReportAController {

    @Autowired
    ReportService reportService;

    @GetMapping("/revenue")
    public String revenue(Model model) {
        model.addAttribute("report", reportService.getRevenueByCategory());
        return "revenue";
    }

    @GetMapping("/vip")
    public String vip(Model model) {
        model.addAttribute("vipList", reportService.getTopCustomers());
        return "vip";
    }
}
