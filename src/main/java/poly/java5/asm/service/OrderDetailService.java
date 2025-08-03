package poly.java5.asm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.entity.OrderDetail;
import poly.java5.asm.repository.OrderDetailRepository;

@Service
@Transactional
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    OrderDetail findById(Long id) {
        return orderDetailRepository.findById(id).orElse(null);
    }

    public List<OrderDetail> findByOrderId(Long orderId) {
        return orderDetailRepository.findAll().stream()
                .filter(detail -> detail.getOrder().getId().equals(orderId))
                .toList();
    }

    void updateById(Long id, OrderDetail orderDetail) {
        OrderDetail existingOrderDetail = findById(id);
        if (existingOrderDetail != null) {
            existingOrderDetail.setProduct(orderDetail.getProduct());
            existingOrderDetail.setQuantity(orderDetail.getQuantity());
            existingOrderDetail.setPrice(orderDetail.getPrice());
            orderDetailRepository.save(existingOrderDetail);
        }
    }

    void deleteById(Long id) {
        orderDetailRepository.deleteById(id);
    }

    void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }
}
