package com.nttdata.BootCampProyectoIG6.service;

import com.nttdata.BootCampProyectoIG6.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Client> createCli(Client c);
    Mono<Client> findByCliId(Integer id);
    Flux<Client> findAllCli();
    Mono<Client> updateCli(Client c);
    Mono<Void> deleteCli(Integer id);
}
