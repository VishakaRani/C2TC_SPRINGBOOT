package com.batch.customer;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CUSTOMER_CONTROLLER 
{
	@Autowired
	private CUSTOMER_SERVICE service;
	
	//Retrieve all the rows from Database
	@GetMapping("/customers")
	public List<CUSTOMER>list()
	{
		return service.listAll();
		
	}
	@GetMapping("/customers/{id}")
	public ResponseEntity<CUSTOMER>get(@PathVariable Integer id)
	{
		CUSTOMER customer = service.get(id);
		return new ResponseEntity<CUSTOMER>(customer,HttpStatus.OK);	
	}
	
	// create a row in database
	
	@PostMapping("/customers")
	public void add(@RequestBody CUSTOMER customer)
	{
		service.save(customer);
	}
	
	// Update operation -record in database
	@PutMapping("customers/{id}")
	@Valid
	public ResponseEntity<?>update(@RequestBody CUSTOMER customer,@PathVariable Integer id)
	{
		try {
			CUSTOMER existcustomer = service.get(id);
			service.save(customer);
			return new ResponseEntity<CUSTOMER>(customer,HttpStatus.OK);
		} catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Delete operation
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	}

