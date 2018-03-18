package ca.skipthedishes.hayden.api.response;

public class StoreResponse {

	private Integer id;
	private String name;
	private String address;

	public StoreResponse(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
