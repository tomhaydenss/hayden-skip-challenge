package ca.skipthedishes.hayden.repository;

import org.springframework.data.repository.CrudRepository;

import ca.skipthedishes.hayden.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
