package com.example.JpaMapping;

import com.example.JpaMapping.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

    Account findByEmployeeId(Integer employeeId);
}
