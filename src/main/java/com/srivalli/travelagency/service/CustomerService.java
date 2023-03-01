package com.srivalli.travelagency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivalli.travelagency.model.Customer;
import com.srivalli.travelagency.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer findCustomerById(Long customerId) {
		return customerRepository.findById(customerId).get();
	}

	@Override
	public List<Customer> findCustomerByFirstName(String firstName) {
		return customerRepository.findByFirstName(firstName).get();
	}

	@Override
	public Customer findCustomerByPhone(String phone) {
		return customerRepository.findByPhone(phone).get();
	}

}
