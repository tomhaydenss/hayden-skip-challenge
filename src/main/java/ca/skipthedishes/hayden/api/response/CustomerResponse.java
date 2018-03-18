package ca.skipthedishes.hayden.api.response;

public class CustomerResponse {

	private Integer id;
	private String email;
	private String name;
	private String address;
	private String creation;

	public CustomerResponse(Integer id, String email, String name, String address, String creation) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.address = address;
		this.setCreation(creation);
	}

	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}

}
