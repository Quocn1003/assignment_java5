package poly.java5.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.java5.asm.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Additional query methods can be defined here if needed
    Category findByName(String name);

    void deleteByName(String name);
}
