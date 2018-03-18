package ca.skipthedishes.hayden.util;

import ca.skipthedishes.hayden.api.request.CustomerRequest;
import static ca.skipthedishes.hayden.util.DateConverter.dateTimeToString;
import ca.skipthedishes.hayden.api.response.CustomerResponse;
import ca.skipthedishes.hayden.domain.Customer;

public class CustomerConverter {

	public static Customer fromCustomerRequest(CustomerRequest customerRequest) {
		Customer customer = new Customer();
		customer.setEmail(customerRequest.getEmail());
		customer.setName(customerRequest.getName());
		customer.setAddress(customerRequest.getAddress());
		customer.setPassword(encryptPassword(customerRequest.getPassword()));
		return customer;
	}

	private static String encryptPassword(String password) {
		// TODO: resolve it later
		return password;
	}

	public static CustomerResponse toCustomerResponse(Customer customer) {
		CustomerResponse result = null;
		if (customer != null) {
			result = new CustomerResponse(customer.getId(), customer.getEmail(), customer.getName(),
					customer.getAddress(), dateTimeToString(customer.getCreation()));
		}
		return result;
	}

}
