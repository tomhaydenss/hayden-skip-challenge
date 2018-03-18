package ca.skipthedishes.hayden.api.response;

public class CousineResponse {

	private Integer id;
	private String name;

	public CousineResponse(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
