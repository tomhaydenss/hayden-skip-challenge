package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.OrderConverter.toOrderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.skipthedishes.hayden.api.request.OrderRequest;
import ca.skipthedishes.hayden.api.response.OrderResponse;
import ca.skipthedishes.hayden.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public OrderResponse findById(Integer id) {
		return toOrderResponse(repository.findOne(id));
	}

	// public CustomerResponse save(CustomerRequest customerRequest) {
	// return
	// toCustomerResponse(repository.save(fromCustomerRequest(customerRequest)));
	// }

	public OrderResponse save(OrderRequest order) {
		return null;
	}

}
