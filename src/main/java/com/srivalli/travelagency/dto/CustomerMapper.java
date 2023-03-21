package com.srivalli.travelagency.dto;

import org.mapstruct.Mapper;

import com.srivalli.travelagency.model.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	Customer dtoToEntity(CustomerDto customerDto);

	CustomerDto entityToDto(Customer customer);
}
