package poly.java5.asm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import poly.java5.asm.repository.AccountRepository;

@Component
public class DBTest {

    @Autowired
    AccountRepository accountRepo;

    @PostConstruct
    public void init() {
        System.out.println("=== Số lượng tài khoản: " + accountRepo.count());
    }
}
