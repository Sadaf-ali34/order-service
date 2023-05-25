package com.learning.service.implementations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.client.ProductClient;
import com.learning.entity.OrderEntity;
import com.learning.enums.Status;
import com.learning.repostiory.OrderRepository;
import com.learning.service.OrderService;
import com.learning.shared.Product;

@Service// manage by spring and object creation
public class OrderImplementation implements OrderService {

	@Autowired //object injection
	private OrderRepository orderRepository;

	@Autowired
	private ProductClient productClient;

	@Override
	public Long create(OrderEntity orderEntity) {
		OrderEntity entity = orderRepository.save(orderEntity);
		return entity.getId();
	}

	@Override
	public OrderEntity findById(Long id) {
		Optional<OrderEntity> orderEntity = orderRepository.findById(id);
		boolean present = orderEntity.isPresent();
		if (present) {
			OrderEntity getOrder = orderEntity.get();
			return getOrder;
		} else {
			return null;
		}
	}

	@Override
	public Status updateById(Long id, OrderEntity orderEntity) {
		try {
			OrderEntity savedOrder = findById(id);
			if (savedOrder != null) {
				savedOrder.setName(orderEntity.getName());
				savedOrder.setDate(orderEntity.getDate());
				orderRepository.save(savedOrder);
				return Status.SUCCESS;
			}
		} catch (Exception exception) {
			System.out.println(exception);
		}
		return Status.FAIL;
	}

	@Override
	public Status deleteById(Long id) {
		orderRepository.deleteById(id);
		return Status.SUCCESS;
	}

	@Override
	public Product findProductByOrderId(Long orderId) {
		try {
			Optional<OrderEntity> entity = orderRepository.findById(orderId);
			OrderEntity getOrder = entity.get();
			//OrderEntity entity = findById(orderId);
			//Long productId = entity.getProductId();
			Product product = productClient.getProduct(getOrder.getProductId());
			return product;
		} catch (Exception exception) {
			System.out.println(exception);
		}
		return null;
	}
}
