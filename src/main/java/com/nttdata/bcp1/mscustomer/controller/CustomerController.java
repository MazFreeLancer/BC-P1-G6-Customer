package com.nttdata.bcp1.mscustomer.controller;

import com.nttdata.bcp1.mscustomer.model.Customer;
import com.nttdata.bcp1.mscustomer.service.CustomerService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public Flux<Customer> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Customer> getCustomer(@PathVariable("id") String id) {
        return customerService.findById(id);
    }

    @PostMapping
    public Mono<Customer> saveCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping
    public Mono<Customer> updateClient(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {
        customerService.delete(id);
    }
}
