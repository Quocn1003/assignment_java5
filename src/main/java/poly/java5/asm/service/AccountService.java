package poly.java5.asm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poly.java5.asm.entity.Account;
import poly.java5.asm.repository.AccountRepository;

@Service
@Transactional
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    Account findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    void deleteByUsername(String username) {
        accountRepository.deleteByUsername(username);
    }

    void deleteByEmail(String email) {
        accountRepository.deleteByEmail(email);
    }

    void save(Account account) {
        accountRepository.save(account);
    }
}
