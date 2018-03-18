package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.StoreConverter.toStoreResponse;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.skipthedishes.hayden.api.response.StoreResponse;
import ca.skipthedishes.hayden.domain.Store;
import ca.skipthedishes.hayden.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	private StoreRepository repository;
	
	public List<StoreResponse> findAll() {
		List<StoreResponse> result = ((List<Store>) repository.findAll()).stream().map(item -> {
			StoreResponse detached = toStoreResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}
	
	public List<StoreResponse> findByText(String text) {
		List<StoreResponse> result = ((List<Store>) repository.findAllByText(text)).stream().map(item -> {
			StoreResponse detached = toStoreResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}
	
	public StoreResponse findById(Integer id) {
		return toStoreResponse(repository.findOne(id));

	}

	public List<StoreResponse> findByCousineId(Integer cousineId) {
		List<StoreResponse> result = ((List<Store>) repository.findAllByCousineId(cousineId)).stream().map(item -> {
			StoreResponse detached = toStoreResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

}
