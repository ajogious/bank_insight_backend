package com.ajogious.bank_insight_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer searchCustomer(String bvn, String phone) {
        if (bvn != null) {
            return customerRepository.findByBvn(bvn);
        } else if (phone != null) {
            return customerRepository.findByPhoneNumber(phone);
        } else {
            return null;
        }
    }
}