package com.disouzam.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
		var orderService = new OrderService();
		orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
