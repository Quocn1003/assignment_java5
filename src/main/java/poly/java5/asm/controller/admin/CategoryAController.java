package poly.java5.asm.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.java5.asm.entity.Category;
import poly.java5.asm.service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryAController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "category";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "category";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        categoryService.deleteById(id);
        return "redirect:/admin/category/index";
    }

    @PostMapping("/create")
    public String create(Category category) {
        categoryService.save(category);
        return "redirect:/admin/category/index";
    }

    @PostMapping("/update")
    public String update(Category category) {
        categoryService.updateById(category.getId(), category);
        return "redirect:/admin/category/index";
    }
}