package ca.skipthedishes.hayden.service;

import static ca.skipthedishes.hayden.util.OrderConverter.fromOrderRequest;
import static ca.skipthedishes.hayden.util.OrderConverter.toOrderResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.skipthedishes.hayden.api.request.OrderItemRequest;
import ca.skipthedishes.hayden.api.request.OrderRequest;
import ca.skipthedishes.hayden.api.response.OrderResponse;
import ca.skipthedishes.hayden.domain.Order;
import ca.skipthedishes.hayden.domain.OrderItem;
import ca.skipthedishes.hayden.domain.Status;
import ca.skipthedishes.hayden.repository.CustomerRepository;
import ca.skipthedishes.hayden.repository.OrderRepository;
import ca.skipthedishes.hayden.repository.ProductRepository;
import ca.skipthedishes.hayden.repository.StoreRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private CustomerRepository customerRepository;

	public OrderResponse findById(Integer id) {
		return toOrderResponse(orderRepository.findOne(id));
	}

	@Transactional
	public OrderResponse save(OrderRequest orderRequest) {
		Order order = fromOrderRequest(orderRequest);
		order.setCustomer(customerRepository.findOne(orderRequest.getCustomerId()));
		order.setStore(storeRepository.findOne(orderRequest.getStoreId()));
		order.setStatus(Status.CREATED);
		createOrderItems(orderRequest.getOrderItems(), order);
		order.setTotal(sumTotalItems(order));
		return toOrderResponse(orderRepository.save(order));
	}

	private Double sumTotalItems(Order order) {
		return order.getOrderItems().stream().mapToDouble(item -> item.getTotal()).sum();
	}

	private void createOrderItems(OrderItemRequest[] orderItems, Order order) {
		for (int i = 0; i < orderItems.length; i++) {
			OrderItem orderItem = new OrderItem();
			orderItem.setProduct(productRepository.findOne(orderItems[i].getProductId()));
			orderItem.setPrice(orderItems[i].getPrice());
			orderItem.setQuantity(orderItems[i].getQuantity());
			orderItem.setTotal(orderItems[i].getPrice() * orderItems[i].getQuantity());
			order.add(orderItem);
		}
	}

}
