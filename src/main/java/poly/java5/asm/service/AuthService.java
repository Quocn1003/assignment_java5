package poly.java5.asm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.entity.Account;
import poly.java5.asm.repository.AccountRepository;

@Service
@Transactional
public class AuthService {

    @Autowired
    AccountRepository accountRepository;

    public boolean login(String username, String password) {
        Optional<Account> acc = accountRepository.findById(username);
        return acc.isPresent() && acc.get().getPassword().equals(password);
    }

    public boolean isAdmin(String username) {
        Optional<Account> acc = accountRepository.findById(username);
        return acc.map(Account::isAdmin).orElse(false);
    }
}
