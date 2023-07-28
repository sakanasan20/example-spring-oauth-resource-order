package tw.niq.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.niq.example.model.OrderModel;
import tw.niq.example.model.OrderStatus;

@RestController
public class OrderController {

	@GetMapping("/orders")
	public List<OrderModel> getOrders() {
		
		OrderModel order1 = new OrderModel(UUID.randomUUID().toString(), "product-id-1", "user-id-1", 1, OrderStatus.NEW);
		OrderModel order2 = new OrderModel(UUID.randomUUID().toString(), "product-id-2", "user-id-1", 1, OrderStatus.NEW);
		
		return Arrays.asList(order1, order2);
	}
	
}
