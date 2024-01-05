package com.graphql.springboot.repo;

import java.util.List;

import com.graphql.springboot.dto.CustomerResponse;
import com.graphql.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//here Integer is class and it is primary key for customer in database.

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(value = "select c from Customer c")
	List<CustomerResponse> findByCustomerName(String name);
	
	List<Customer> findByCustomerNameContaining(String name);

	
}
