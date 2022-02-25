package com.nttdata.BootCampProyectoIG6.repository;

import com.nttdata.BootCampProyectoIG6.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, Integer> {

}
