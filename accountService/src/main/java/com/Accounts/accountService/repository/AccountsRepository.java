package com.Accounts.accountService.repository;

import com.Accounts.accountService.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Object> findByCustomerId(Long customerId);

    void deleteByCustomerId(Long customerId);
}
