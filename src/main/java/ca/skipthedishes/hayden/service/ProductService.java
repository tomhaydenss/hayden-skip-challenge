package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.ProductConverter.toProductResponse;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.skipthedishes.hayden.api.response.ProductResponse;
import ca.skipthedishes.hayden.domain.Product;
import ca.skipthedishes.hayden.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<ProductResponse> findAll() {
		List<ProductResponse> result = ((List<Product>) repository.findAll()).stream().map(item -> {
			ProductResponse detached = toProductResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

	public ProductResponse findById(Integer id) {
		return toProductResponse(repository.findOne(id));

	}

	public List<ProductResponse> findByText(String text) {
		List<ProductResponse> result = ((List<Product>) repository.findAllByText(text)).stream().map(item -> {
			ProductResponse detached = toProductResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

	public List<ProductResponse> findByStoreId(Integer storeId) {
		List<ProductResponse> result = ((List<Product>) repository.findAllByStoreId(storeId)).stream().map(item -> {
			ProductResponse detached = toProductResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

}
