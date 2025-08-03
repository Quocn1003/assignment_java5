package poly.java5.asm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import poly.java5.asm.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional query methods can be defined here if needed
    List<Order> findByAccountUsername(String username);

    Double getTotalRevenue();

    @Query("SELECT new poly.java5.asm.dto.RevenueReport(od.product.category.name, SUM(od.price * od.quantity)) " +
            "FROM OrderDetail od " +
            "GROUP BY od.product.category.name")
    List<Object> getRevenueByCategory();

    @Query("SELECT new poly.java5.asm.dto.TopCustomerReport(o.account.username, SUM(od.price * od.quantity)) " +
            "FROM Order o JOIN o.orderDetails od " +
            "GROUP BY o.account.username ORDER BY SUM(od.price * od.quantity) DESC")
    List<Object[]> getTopCustomers();
}
