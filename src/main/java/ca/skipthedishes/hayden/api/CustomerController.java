package ca.skipthedishes.hayden.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.skipthedishes.hayden.api.request.CustomerRequest;
import ca.skipthedishes.hayden.api.response.CustomerResponse;
import ca.skipthedishes.hayden.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/api/v1/Customer", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public CustomerResponse create(@RequestBody CustomerRequest customer) {

		return service.save(customer);

	}

}
