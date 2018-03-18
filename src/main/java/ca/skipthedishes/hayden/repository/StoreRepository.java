package ca.skipthedishes.hayden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ca.skipthedishes.hayden.domain.Store;

public interface StoreRepository extends CrudRepository<Store, Integer> {
	
	@Query("SELECT s FROM Store s INNER JOIN s.cousine c WHERE c.id = :cousineId")
	List<Store> findAllByCousineId(@Param("cousineId") Integer cousineId);
	
	@Query("SELECT s FROM Store s WHERE s.name LIKE %:text%")
	List<Store> findAllByText(@Param("text") String text);

}
