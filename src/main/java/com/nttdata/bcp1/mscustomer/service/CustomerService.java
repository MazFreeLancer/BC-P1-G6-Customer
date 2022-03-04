package com.nttdata.bcp1.mscustomer.service;

import com.nttdata.bcp1.mscustomer.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<Customer> createCust(Customer c);
    Mono<Customer> findByCustId(String id);
    Flux<Customer> findAllCust();
    Mono<Customer> updateCust(Customer c);
    Mono<Void> deleteCust(String id);
}
