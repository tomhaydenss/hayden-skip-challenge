package ca.skipthedishes.hayden.repository;

import org.springframework.data.repository.CrudRepository;

import ca.skipthedishes.hayden.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
