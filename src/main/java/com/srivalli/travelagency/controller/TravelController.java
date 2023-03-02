package com.srivalli.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivalli.travelagency.model.Customer;
import com.srivalli.travelagency.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TravelController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {

		log.info("/create ->>>");
		Customer savedCustomer = customerService.saveCustomer(customer);
		log.info("saving customer");
		System.out.println(customer);

		log.info("saved customer");
		System.out.println(savedCustomer);
		if (savedCustomer != null) {
			return new ResponseEntity<String>("Created", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/read/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long customerId, @RequestBody Customer customer) {

		log.info("/read/{id} ->>>");
		Customer getCustomer = customerService.findCustomerById(customerId);

		log.info("reading customer");
		System.out.println(getCustomer);

		return new ResponseEntity<Customer>(getCustomer, HttpStatus.OK);
	}
}
