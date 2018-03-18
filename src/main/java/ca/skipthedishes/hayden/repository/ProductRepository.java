package ca.skipthedishes.hayden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ca.skipthedishes.hayden.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("SELECT p FROM Product p WHERE p.name LIKE %:text% OR p.description LIKE %:text%")
	List<Product> findAllByText(@Param("text") String text);

}
