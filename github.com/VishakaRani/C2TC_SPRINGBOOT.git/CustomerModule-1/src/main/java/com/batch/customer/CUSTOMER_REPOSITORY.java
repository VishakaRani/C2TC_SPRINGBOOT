package com.batch.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CUSTOMER_REPOSITORY extends JpaRepository<CUSTOMER, Integer> 
{
   
}