package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.CustomerConverter.fromCustomerRequest;
import static ca.skipthedishes.hayden.util.CustomerConverter.toCustomerResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.skipthedishes.hayden.api.request.CustomerRequest;
import ca.skipthedishes.hayden.api.response.CustomerResponse;
import ca.skipthedishes.hayden.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public CustomerResponse save(CustomerRequest customerRequest) {
		return toCustomerResponse(repository.save(fromCustomerRequest(customerRequest)));
	}

}
