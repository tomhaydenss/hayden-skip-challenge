package ca.skipthedishes.hayden.api.request;

public class OrderRequest {

	private Integer customerId;
	private String deliveryAddress;
	private String contact;
	private Integer storeId;
	private OrderItemRequest[] orderItems;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public OrderItemRequest[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItemRequest[] orderItems) {
		this.orderItems = orderItems;
	}

}
