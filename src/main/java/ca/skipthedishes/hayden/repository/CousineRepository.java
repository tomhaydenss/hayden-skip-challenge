package ca.skipthedishes.hayden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ca.skipthedishes.hayden.domain.Cousine;

public interface CousineRepository extends CrudRepository<Cousine, Integer> {
	
	@Query("SELECT c FROM Cousine c WHERE c.name LIKE %:text%")
	List<Cousine> findAllByText(@Param("text") String text);

}
