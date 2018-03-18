package ca.skipthedishes.hayden.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.skipthedishes.hayden.api.response.ProductResponse;
import ca.skipthedishes.hayden.api.response.StoreResponse;
import ca.skipthedishes.hayden.service.StoreService;

@RestController
public class StoreController {
	
	@Autowired
	private StoreService service;
	
	@RequestMapping(value = "/api/v1/Store", method = RequestMethod.GET, produces = "application/json")
	public List<StoreResponse> findAll() {

		return service.findAll();

	}
	
	@RequestMapping(value = "/api/v1/Store/search/{searchText}", method = RequestMethod.GET, produces = "application/json")
	public List<StoreResponse> findAllByText(@PathVariable String searchText) {

		return service.findByText(searchText);

	}
	
	@RequestMapping(value = "/api/v1/Store/{storeId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<StoreResponse> findById(@PathVariable Integer storeId) {

		return Optional
	            .ofNullable( service.findById(storeId) )
	            .map( store -> ResponseEntity.ok().body(store) )
	            .orElseGet( () -> ResponseEntity.notFound().build() );
	}

	@RequestMapping(value = "/api/v1/Cousine/{cousineId}/stores", method = RequestMethod.GET, produces = "application/json")
	public List<StoreResponse> findAllByCousineId(@PathVariable Integer cousineId) {

		return service.findByCousineId(cousineId);

	}

}
