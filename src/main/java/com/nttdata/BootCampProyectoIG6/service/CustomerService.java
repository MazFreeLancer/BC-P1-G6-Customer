package com.nttdata.BootCampProyectoIG6.service;

import com.nttdata.BootCampProyectoIG6.model.Customer;
import com.nttdata.BootCampProyectoIG6.model.CustomerType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<Customer> createCust(Customer c);
    Mono<Customer> findByCustId(String id);
    Flux<Customer> findAllCust();
    Mono<Customer> updateCust(Customer c);
    Mono<Void> deleteCust(String id);
}
