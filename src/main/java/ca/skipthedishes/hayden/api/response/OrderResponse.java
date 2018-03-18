package ca.skipthedishes.hayden.api.response;

import java.util.List;

public class OrderResponse {

	private Integer id;
	private String date;
	private Integer customerId;
	private String deliveryAddress;
	private String contact;
	private Integer storeId;
	private List<OrderItemResponse> orderItems;
	private Double total;
	private String status;
	private String lastUpdate;

	public OrderResponse(Integer id, String date, Integer customerId, String deliveryAddress, String contact,
			Integer storeId, List<OrderItemResponse> orderItems, Double total, String status, String lastUpdate) {
		super();
		this.id = id;
		this.date = date;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.contact = contact;
		this.storeId = storeId;
		this.orderItems = orderItems;
		this.total = total;
		this.status = status;
		this.lastUpdate = lastUpdate;
	}

	public Integer getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public String getContact() {
		return contact;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public List<OrderItemResponse> getOrderItems() {
		return orderItems;
	}

	public Double getTotal() {
		return total;
	}

	public String getStatus() {
		return status;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

}
