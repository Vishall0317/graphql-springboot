package com.graphql.springboot.controller;

import java.util.List;

import com.graphql.springboot.dto.CustomerRequestDTO;
import com.graphql.springboot.dto.CustomerResponseDTO;
import com.graphql.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/*
	 * save customer details
	 */

	@MutationMapping("createCustomer")
	public CustomerResponseDTO saveCustomerData(@Argument CustomerRequestDTO customerRequestDTO) {
		return customerService.saveCustomerData(customerRequestDTO);
	}

	/*
	 * get all customer details
	 */

	@QueryMapping("getCustomers")
	public List<CustomerResponseDTO> getCustomersDetails() {
		return customerService.getCustomersDetails();
	}

	/*
	 * get single customer details by id
	 */

	@QueryMapping("getCustomer")
	public CustomerResponseDTO getCustomersDetails(@Argument Integer customerId) {
		return customerService.getCustomersDetails(customerId);
	}

	/*
	 * get single customer details by name
	 */

	@QueryMapping("getCustomersDetails")
	public List<CustomerResponseDTO> getCustomersDetails(@Argument String name) {
		return customerService.getCustomersDetailsByName(name);
	}

	/*
	 * get similar or reference containing customer details by name
	 */

	@QueryMapping("getContainingCustomersDetails")
	public List<CustomerResponseDTO> getContainingCustomersDetails(@Argument String name) {
		if (name != null) {
			return customerService.getContainingCustomersDetails(name);
		}
		return customerService.getCustomersDetails();
	}

	/*
	 * delete customer data
	 */

	@QueryMapping("deleteCustomer")
	public boolean deleteCustomer(@Argument Integer customerId) {
		return customerService.deleteCustomer(customerId);
	}
}










