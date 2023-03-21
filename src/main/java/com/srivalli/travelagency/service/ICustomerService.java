package com.srivalli.travelagency.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srivalli.travelagency.dto.CustomerDto;
import com.srivalli.travelagency.model.Customer;

@Service
public interface ICustomerService {

	public CustomerDto saveCustomer(CustomerDto customerDto);

	public CustomerDto findCustomerById(Long customerId);

	public List<CustomerDto> findCustomerByFirstName(String firstName);

	public CustomerDto findCustomerByPhone(String phone);

	public CustomerDto updateCustomer(Long customerId, CustomerDto customerDto);

	public void deleteCustomerById(Long customerId);

}