package com.product.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ProductEntity;
import com.product.exceptions.WrongProductIdException;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;
import com.product.to.CarTO;
import com.product.to.ProductTO;

@Service
public class ProductServiceImpl implements ProductService<ProductTO> {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<ProductTO> findAll() {
		
		List<ProductEntity> productEntities = productRepository.findAll();
		
		return productEntities.stream()
						   .map(product -> new ProductTO(product))
						   .collect(Collectors.toList());
	}

	@Override
	public List<ProductTO> findByModel(String model) {
		List<ProductEntity> productEntities = productRepository.findByModel(model);
		
		return productEntities.stream()
						   .map(product -> new ProductTO(product))
						   .collect(Collectors.toList());
	}

	@Override
	public ProductTO findById(Long id) {
		ProductEntity product = productRepository.findById(id).orElse(new ProductEntity());
		
		return new ProductTO(product);
	}

	@Override
	public List<CarTO> getAllAvailable() {
		// TODO Auto-generated method stub
		return null;
	}

}
