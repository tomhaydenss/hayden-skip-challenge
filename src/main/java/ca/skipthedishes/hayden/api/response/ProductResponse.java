package ca.skipthedishes.hayden.api.response;

public class ProductResponse {

	private Integer id;
	private String name;
	private String description;
	private Double price;
	
	public ProductResponse(Integer id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

}
