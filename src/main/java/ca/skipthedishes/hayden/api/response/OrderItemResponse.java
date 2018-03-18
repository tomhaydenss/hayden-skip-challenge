package ca.skipthedishes.hayden.api.response;

public class OrderItemResponse {

	private Integer id;
	private ProductResponse product;
	private Double price;
	private Integer quantity;
	private Double total;

	public OrderItemResponse(Integer id, ProductResponse product, Double price, Integer quantity, Double total) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public ProductResponse getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getTotal() {
		return total;
	}

}
