package poly.java5.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.java5.asm.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    // Additional query methods can be defined here if needed
}
