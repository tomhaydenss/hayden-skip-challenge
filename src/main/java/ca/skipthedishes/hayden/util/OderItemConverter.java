package ca.skipthedishes.hayden.util;

import static ca.skipthedishes.hayden.util.ProductConverter.toProductResponse;

import java.util.List;
import java.util.stream.Collectors;

import ca.skipthedishes.hayden.api.response.OrderItemResponse;
import ca.skipthedishes.hayden.domain.OrderItem;

public class OderItemConverter {

	public static OrderItemResponse toOrderItemResponse(OrderItem orderItem) {
		OrderItemResponse result = null;
		if (orderItem != null) {
			result = new OrderItemResponse(orderItem.getId(), toProductResponse(orderItem.getProduct()),
					orderItem.getPrice(), orderItem.getQuantity(), orderItem.getTotal());
		}
		return result;
	}

	public static List<OrderItemResponse> toOrderItemResponse(List<OrderItem> orderItems) {
		List<OrderItemResponse> result = orderItems.stream().map(item -> {
			OrderItemResponse detached = toOrderItemResponse(item);
			return detached;
		}).collect(Collectors.toList());
		return result;
	}

}
