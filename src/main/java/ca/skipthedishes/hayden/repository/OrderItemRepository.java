package ca.skipthedishes.hayden.repository;

import org.springframework.data.repository.CrudRepository;

import ca.skipthedishes.hayden.domain.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {

}
