package poly.java5.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.java5.asm.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be defined here if needed

}
