package com.srivalli.travelagency;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srivalli.travelagency.model.Customer;
import com.srivalli.travelagency.service.CustomerService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TravelagencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TravelagencyApplication.class, args);
		CustomerService customerService = context.getBean(CustomerService.class);

		Customer customer = new Customer();
		customer.setFirstName("Shivam");
		customer.setLastName("LNU");
		customer.setCommunicationAddress("sonipat");
		customer.setPermanentAddress("sonipat");
		customer.setPhone("0123456789");

		customerService.saveCustomer(customer);

		Customer customer1 = new Customer();
		customer1.setFirstName("Shivam");
		customer1.setLastName("Rathi");
		customer1.setCommunicationAddress("delhi");
		customer1.setPermanentAddress("delhi");
		customer1.setPhone("123456999");

		customerService.saveCustomer(customer1);

		Customer customer2 = new Customer();
		customer2.setFirstName("Akash");
		customer2.setLastName("Raturi");
		customer2.setPermanentAddress("meerut");
		customer2.setCommunicationAddress("meerut");
		customer2.setPhone("0123456799");

		customerService.saveCustomer(customer2);

		Customer customerById = customerService.findCustomerById((long) 1);
		log.info("logging customersById ->>>");
		System.out.println(customerById);

		List<Customer> customersByFirstName = customerService.findCustomerByFirstName("Shivam");
		log.info("logging customersByFirstName ->>>");
		System.out.println(customersByFirstName);

		Customer customerByPhone = customerService.findCustomerByPhone("0123456789");
		log.info("logging customerByPhone ->>>");
		System.out.println(customerByPhone);

		Customer update = customerService.findCustomerById((long) 2);
		log.info("logging update ->>>");
		System.out.println(update);
		update.setFirstName("Srivalli");
		customerService.updateCustomer(update);

		log.info("logging delete ->>>");
		customerService.deleteCustomerById((long) 1);

	}

}
