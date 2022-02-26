package com.nttdata.BootCampProyectoIG6.service;

import com.nttdata.BootCampProyectoIG6.model.Client;
import com.nttdata.BootCampProyectoIG6.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientRepository clientRepository;

    @Override
    public Mono<Client> createCli(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Mono<Client> findByCliId(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Flux<Client> findAllCli() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> updateCli(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Mono<Void> deleteCli(Integer id) {
        return clientRepository.deleteById(id);
    }
}
