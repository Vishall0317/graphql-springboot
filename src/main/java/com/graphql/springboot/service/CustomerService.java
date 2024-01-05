package com.graphql.springboot.service;

import com.graphql.springboot.dto.CustomerRequestDTO;
import com.graphql.springboot.dto.CustomerResponse;
import com.graphql.springboot.dto.CustomerResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CustomerService {

	boolean saveCustomerData(CustomerRequestDTO customerRequestDTO);

	List<CustomerResponseDTO> getCustomersDetails();
	
	CustomerResponseDTO getCustomersDetails(Integer customerId);
	
	List<CustomerResponse> getCustomersDetailsByName(String name);

	List<CustomerResponseDTO> getContainingCustomersDetails(String name);

	boolean deleteCustomer(Integer customerId);


}
