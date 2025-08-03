package poly.java5.asm.service;

import java.util.List;
import poly.java5.asm.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public void updateById(Long id, Category category) {
        if (categoryRepository.existsById(id)) {
            category.setId(id);
            categoryRepository.save(category);
        }
    }

    public void updateByName(String name, Category category) {
        Category existingCategory = categoryRepository.findByName(name);
        if (existingCategory != null) {
            category.setId(existingCategory.getId());
            categoryRepository.save(category);
        }
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public void deleteByName(String name) {
        categoryRepository.deleteByName(name);
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }
}
