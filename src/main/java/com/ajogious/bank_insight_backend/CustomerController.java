package com.ajogious.bank_insight_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/search")
    public ResponseEntity<Object> searchCustomer(
            @RequestParam(required = false) String bvn,
            @RequestParam(required = false) String phone) {

        if (bvn == null && phone == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("message", "Provide either BVN or Phone Number to search"));
        }

        Customer customer = customerService.searchCustomer(bvn, phone);

        if (customer == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Customer not found"));
        } else {
            return ResponseEntity.ok(customer);
        }
    }
}
