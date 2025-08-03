package poly.java5.asm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.java5.asm.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
    // Additional query methods can be defined here if needed
    Account findByUsername(String username);

    Account findByEmail(String email);

    void deleteByUsername(String username);

    void deleteByEmail(String email);

}
