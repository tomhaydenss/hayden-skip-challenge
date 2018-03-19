package ca.skipthedishes.hayden.util;

import static ca.skipthedishes.hayden.util.DateConverter.dateTimeToString;
import static ca.skipthedishes.hayden.util.OderItemConverter.toOrderItemResponse;

import ca.skipthedishes.hayden.api.request.OrderRequest;
import ca.skipthedishes.hayden.api.response.OrderResponse;
import ca.skipthedishes.hayden.domain.Order;

public class OrderConverter {

	public static Order fromOrderRequest(OrderRequest orderRequest) {
		Order order = new Order();
		order.setContact(orderRequest.getContact());
		order.setDeliveryAddress(orderRequest.getDeliveryAddress());
		return order;
	}

	public static OrderResponse toOrderResponse(Order order) {
		OrderResponse result = null;
		if (order != null) {
			result = new OrderResponse(order.getId(), dateTimeToString(order.getDate()), order.getCustomer().getId(),
					order.getDeliveryAddress(), order.getContact(), order.getStore().getId(),
					toOrderItemResponse(order.getOrderItems()), order.getTotal(), order.getStatus().name(),
					dateTimeToString(order.getLastUpdate()));
		}

		return result;
	}

}
