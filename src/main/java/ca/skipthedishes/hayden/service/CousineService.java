package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.CousineConverter.toCousineResponse;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.skipthedishes.hayden.api.response.CousineResponse;
import ca.skipthedishes.hayden.domain.Cousine;
import ca.skipthedishes.hayden.repository.CousineRepository;

@Service
public class CousineService {

	@Autowired
	private CousineRepository repository;

	public List<CousineResponse> findAll() {
		List<CousineResponse> result = ((List<Cousine>) repository.findAll()).stream().map(item -> {
			CousineResponse detached = toCousineResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

	public CousineResponse findById(Integer id) {
		return toCousineResponse(repository.findOne(id));

	}

	public List<CousineResponse> findByText(String text) {
		List<CousineResponse> result = ((List<Cousine>) repository.findAllByText(text)).stream().map(item -> {
			CousineResponse detached = toCousineResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

}
