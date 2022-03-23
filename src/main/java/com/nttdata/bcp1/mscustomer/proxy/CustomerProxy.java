package com.nttdata.bcp1.mscustomer.proxy;

import com.nttdata.bcp1.mscustomer.model.Credit;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

public class CustomerProxy {

    private final WebClient.Builder webClientBuilder = WebClient.builder();

    //get credits by id client
    public Flux<Credit> getCredits(String idCustomer){
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:9020/credit/allByCustomer/{id}", idCustomer)
                .retrieve()
                .bodyToFlux(Credit.class);
    }

}
