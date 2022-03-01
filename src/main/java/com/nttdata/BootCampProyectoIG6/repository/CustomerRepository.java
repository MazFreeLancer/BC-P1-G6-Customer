package com.nttdata.BootCampProyectoIG6.repository;

import com.nttdata.BootCampProyectoIG6.model.Customer;
import com.nttdata.BootCampProyectoIG6.model.CustomerType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

}
