package ca.skipthedishes.hayden.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.skipthedishes.hayden.api.request.OrderRequest;
import ca.skipthedishes.hayden.api.response.OrderResponse;
import ca.skipthedishes.hayden.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@RequestMapping(value = "/api/v1/Order/{orderId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<OrderResponse> findById(@PathVariable Integer orderId) {

		return Optional
	            .ofNullable( service.findById(orderId) )
	            .map( order -> ResponseEntity.ok().body(order) )
	            .orElseGet( () -> ResponseEntity.notFound().build() );
	}
	
	@RequestMapping(value = "/api/v1/Order", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrderResponse create(@RequestBody OrderRequest order) {

		return service.save(order);

	}

}
