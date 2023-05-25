package com.learning.service;

import com.learning.entity.OrderEntity;
import com.learning.enums.Status;
import com.learning.shared.Product;

public interface OrderService {

	Long create(OrderEntity orderEntity);
	OrderEntity findById(Long id);
	Status updateById(Long id, OrderEntity orderEntity);
	Status deleteById(Long id);
	Product findProductByOrderId(Long orderId);
}
