package com.srivalli.travelagency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivalli.travelagency.dto.CustomerDto;
import com.srivalli.travelagency.dto.CustomerMapper;
import com.srivalli.travelagency.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository repository;

	@Autowired
	CustomerMapper mapper;

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		return mapper.entityToDto(repository.save(mapper.dtoToEntity(customerDto)));
	}

	@Override
	public CustomerDto findCustomerById(Long customerId) {
		return mapper.entityToDto(repository.findById(customerId).get());
	}

	@Override
	public List<CustomerDto> findCustomerByFirstName(String firstName) {
		return repository.findByFirstName(firstName).get().stream().map((entity) -> mapper.entityToDto(entity))
				.toList();
	}

	@Override
	public CustomerDto findCustomerByPhone(String phone) {
		return mapper.entityToDto(repository.findByPhone(phone).get());
	}

	@Override
	public CustomerDto updateCustomer(Long customerId, CustomerDto customerDto) {
		return mapper.entityToDto(repository.save(mapper.dtoToEntity(customerDto)));
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		repository.deleteById(customerId);
	}

}
