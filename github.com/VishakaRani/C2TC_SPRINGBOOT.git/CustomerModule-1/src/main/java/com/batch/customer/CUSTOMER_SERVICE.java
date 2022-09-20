package com.batch.customer;

import java.util.List;


import org.springframework.stereotype.Service;
@Service
public class CUSTOMER_SERVICE 
{
	
	CUSTOMER_REPOSITORY repository;

	public List<CUSTOMER> listAll()
	{
		return repository.findAll();
	}

	public CUSTOMER get(Integer id)
	{
	
		return repository.findById(id).get();
	}

	public void save(CUSTOMER customer)
	{
		 repository.save(customer);
	
	}

	public void delete(Integer id) 
	{
		 repository.deleteById(id);
	}

	}


