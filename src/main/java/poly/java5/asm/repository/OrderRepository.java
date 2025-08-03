package poly.java5.asm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.java5.asm.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional query methods can be defined here if needed
    List<Order> findByAccountUsername(String username);

    Double getTotalRevenue();

    List<Object> getRevenueByCategory();

    List<Object[]> getTopCustomers();
}
