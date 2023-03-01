package com.srivalli.travelagency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.srivalli.travelagency.model.Customer;

@Service
public interface ICustomerService {

	public Customer saveCustomer(Customer customer);

	public Customer findCustomerById(Long customerId);

	public List<Customer> findCustomerByFirstName(String firstName);

	public Customer findCustomerByPhone(String phone);

	public Customer updateCustomer(Customer customer);

	public void deleteCustomerById(Long customerId);

}