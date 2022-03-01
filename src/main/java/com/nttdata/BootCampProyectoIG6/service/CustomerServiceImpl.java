package com.nttdata.BootCampProyectoIG6.service;

import com.nttdata.BootCampProyectoIG6.model.Customer;
import com.nttdata.BootCampProyectoIG6.model.CustomerType;
import com.nttdata.BootCampProyectoIG6.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Mono<Customer> createCust(Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public Mono<Customer> findByCustId(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Flux<Customer> findAllCust() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> updateCust(Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public Mono<Void> deleteCust(String id) {
        return customerRepository.deleteById(id);
    }

}
