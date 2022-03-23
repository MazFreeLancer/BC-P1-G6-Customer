package com.nttdata.bcp1.mscustomer;

import com.nttdata.bcp1.mscustomer.controller.CustomerController;
import com.nttdata.bcp1.mscustomer.model.Customer;
import com.nttdata.bcp1.mscustomer.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebFluxTest(CustomerController.class)
class MsCustomerApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@MockBean
	private CustomerService customerService;

	@Test
	void createCustomer() {
		Mono<Customer> customerMono =
				Mono.just(
						new Customer("1","Manuel","VIP","PERSONAL"));
		Customer customer =
				new Customer("1","Manuel","VIP","PERSONAL");
		when(customerService.save(customer)).thenReturn(customerMono);

		webTestClient.post().uri("/customer")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(customerMono),Customer.class)
				.exchange()
				.expectStatus().isOk();
	}
}
