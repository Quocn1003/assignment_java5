package poly.java5.asm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.repository.OrderRepository;

@Service
@Transactional
public class ReportService {

    @Autowired
    OrderRepository orderRepository;

    // Tong doanh thu
    public Double getTotalRevenue() {
        return orderRepository.getTotalRevenue();
    }

    // Doanh thu theo phan loai
    public List<Object> getRevenueByCategory() {
        return orderRepository.getRevenueByCategory();
    }

    // Top khach hang
    public List<Object[]> getTopCustomers() {
        return orderRepository.getTopCustomers();
    }
}
