package com.batch.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CUSTOMER_SERVICE {

	@Autowired
	private CUSTOMER_REPOSITORY repository;

	public List<Customer> listAll() {
		
		return repository.findAll();
	}

	public Customer get(Integer id) {
		
		return repository.findById(id).get();
	
}

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
		
	}
}
