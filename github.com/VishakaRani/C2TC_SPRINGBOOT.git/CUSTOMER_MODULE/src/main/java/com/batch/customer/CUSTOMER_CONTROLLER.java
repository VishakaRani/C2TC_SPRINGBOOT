package com.batch.customer;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")

public class CUSTOMER_CONTROLLER 
{
	@Autowired
	private CUSTOMER_SERVICE service;
	
	//Retrieve all the rows from Database
	@GetMapping("/customers")
	public List<Customer>list()
	{
		return service.listAll();
		
	}
	//Retrieve specific records
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer>get(@PathVariable Integer id)
	{
		Customer customer = service.get(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);	
	}
	
	// create a row in database
	@PostMapping("/customers")

	public void add(@RequestBody Customer customer)  
	{  
		service.save(customer);    
	}  
	
	// Update operation -record in database

	@PutMapping("/customers/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer,@PathVariable Integer id)
	{
		try {
			Customer existCustomer = service.get(id);
			service.save(customer);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Delete operation
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	}