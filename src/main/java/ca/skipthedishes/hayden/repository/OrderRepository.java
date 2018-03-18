package ca.skipthedishes.hayden.repository;

import org.springframework.data.repository.CrudRepository;

import ca.skipthedishes.hayden.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
