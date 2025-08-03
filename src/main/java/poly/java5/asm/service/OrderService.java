package poly.java5.asm.service;

import java.util.List;
import poly.java5.asm.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> findByAccountUsername(String username) {
        return orderRepository.findByAccountUsername(username);
    }

    public void updateById(Long id, Order order) {
        Order existingOrder = findById(id);
        if (existingOrder != null) {
            existingOrder.setCreatedDate(order.getCreatedDate());
            existingOrder.setAccount(order.getAccount());
            existingOrder.setOrderDetails(order.getOrderDetails());
            orderRepository.save(existingOrder);
        }
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    public void save(Order order) {
        orderRepository.save(order);
    }
}
