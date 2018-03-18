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
import ca.skipthedishes.hayden.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value = "/api/v1/Product", method = RequestMethod.GET, produces = "application/json")
	public List<ProductResponse> findAll() {

		return service.findAll();

	}
	
	@RequestMapping(value = "/api/v1/Product/search/{searchText}", method = RequestMethod.GET, produces = "application/json")
	public List<ProductResponse> findAllByText(@PathVariable String searchText) {

		return service.findByText(searchText);

	}
	
	@RequestMapping(value = "/api/v1/Product/{productId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ProductResponse> findById(@PathVariable Integer productId) {

		return Optional
	            .ofNullable( service.findById(productId) )
	            .map( product -> ResponseEntity.ok().body(product) )
	            .orElseGet( () -> ResponseEntity.notFound().build() );
	}
	
	
	@RequestMapping(value = "/api/v1/Store/{storeId}/products", method = RequestMethod.GET, produces = "application/json")
	public List<ProductResponse> findByStoreId(@PathVariable Integer storeId) {

		return service.findByStoreId(storeId);
	}

}
