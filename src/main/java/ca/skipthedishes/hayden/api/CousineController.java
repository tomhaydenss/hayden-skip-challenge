package ca.skipthedishes.hayden.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.skipthedishes.hayden.api.response.CousineResponse;
import ca.skipthedishes.hayden.service.CousineService;

@RestController
public class CousineController {
	
	@Autowired
	private CousineService service;
	
	@RequestMapping(value = "/api/v1/Cousine", method = RequestMethod.GET, produces = "application/json")
	public List<CousineResponse> findAll() {

		return service.findAll();

	}
	
	@RequestMapping(value = "/api/v1/Cousine/search/{searchText}", method = RequestMethod.GET, produces = "application/json")
	public List<CousineResponse> findAllByText(@PathVariable String searchText) {

		return service.findByText(searchText);

	}

}
