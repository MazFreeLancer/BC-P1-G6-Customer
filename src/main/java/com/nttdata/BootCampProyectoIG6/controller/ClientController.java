package com.nttdata.BootCampProyectoIG6.controller;

import com.nttdata.BootCampProyectoIG6.model.Client;
import com.nttdata.BootCampProyectoIG6.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/create/cli")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCli(@RequestBody Client client){
        clientService.createCli(client);
    }

    @GetMapping(value = "/get/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus
    public Flux<Client> findAll(){
        return clientService.findAllCli();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus
    public ResponseEntity<Mono<Client>> findById(@PathVariable("id") Integer id){
        Mono<Client> clientMono = clientService.findByCliId(id);
        return new ResponseEntity<Mono<Client>>(clientMono, clientMono !=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update/cli")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Mono<Client>> updateCli(@RequestBody Client employee){
        Mono<Client> clientMono = clientService.updateCli(employee);
        return new ResponseEntity<Mono<Client>>(clientMono, clientMono!=null? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> deleteCli(@PathVariable("id") Integer id){
        return clientService.deleteCli(id);
    }
}
