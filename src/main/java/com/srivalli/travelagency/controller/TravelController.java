package com.srivalli.travelagency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivalli.travelagency.dto.CustomerDto;
import com.srivalli.travelagency.service.CustomerService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
public class TravelController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public ResponseEntity<?> createCustomer(@Valid @RequestBody CustomerDto customerDto) {

		CustomerDto savedCustomer = customerService.saveCustomer(customerDto);

		if (savedCustomer != null) {
			return new ResponseEntity<CustomerDto>(savedCustomer, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/read/{id}")
	public ResponseEntity<CustomerDto> readCustomerById(@PathVariable("id") Long id) {

		CustomerDto getCustomer = customerService.findCustomerById(id);

		return new ResponseEntity<CustomerDto>(getCustomer, HttpStatus.OK);
	}

	@GetMapping(value = "/read", params = "phone")
	@ResponseBody
	public ResponseEntity<CustomerDto> readByPhone(@RequestParam("phone") String phone) {

		CustomerDto getCustomer = customerService.findCustomerByPhone(phone);

		return new ResponseEntity<CustomerDto>(getCustomer, HttpStatus.OK);
	}

	@GetMapping(value = "/read", params = "fname")
	@ResponseBody
	public ResponseEntity<List<CustomerDto>> readByFirstName(@RequestParam("fname") String fname) {

		List<CustomerDto> customerDtoList = customerService.findCustomerByFirstName(fname);

		return new ResponseEntity<List<CustomerDto>>(customerDtoList, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{id}")
	@ResponseBody
	public ResponseEntity<CustomerDto> updateCustomer(
			@PathVariable("id") @Min(value = 0L, message = "Id can not be negative") Long id,
			@Valid @RequestBody CustomerDto customerDto) {

		CustomerDto updatedEntity = customerService.updateCustomer(id, customerDto);

		return new ResponseEntity<CustomerDto>(updatedEntity, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/delete/{id}")
	@ResponseBody
	public ResponseEntity<String> deleteCustomer(
			@PathVariable("id") @Min(value = 0L, message = "Id can not be negative") Long id) {

		customerService.deleteCustomerById(id);

		return new ResponseEntity<String>("Deleted", HttpStatus.ACCEPTED);
	}
}
