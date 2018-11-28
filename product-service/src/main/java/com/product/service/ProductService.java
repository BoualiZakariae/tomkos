package com.product.service;

import java.util.List;

import com.product.to.CarTO;

public interface ProductService<T> {

	List<T> findAll();
	
	List<T> findByModel(String model);
	
	T findById(Long id);

	List<CarTO> getAllAvailable();
}
