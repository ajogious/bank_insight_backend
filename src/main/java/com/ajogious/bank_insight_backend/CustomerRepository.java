package com.ajogious.bank_insight_backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByBvn(String bvn);

    Customer findByPhoneNumber(String phoneNumber);
}
