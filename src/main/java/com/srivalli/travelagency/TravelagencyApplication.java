package com.srivalli.travelagency;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srivalli.travelagency.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class TravelagencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TravelagencyApplication.class, args);
		CustomerService customerService = context.getBean(CustomerService.class);

//		Customer c0 = new Customer();
//		c0.setFirstName("Shivam");
//		c0.setLastName("Rathi");
//		c0.setPermanentAddress("Delhi");
//		c0.setCommunicationAddress("Hyderabad");
//		c0.setPhone("0123456700");
//		c0.setStartingLocation("Delhi");
//		c0.setDestinationLocation("Hyderabad");
//		c0.setLocations("Delhi, Noida, Hyderabad");
//		c0.setPackageName("Fun Package");
//		c0.setCost(1000);
//		c0.setNotes("abcdefgh");
//
//		Customer c1 = new Customer();
//		c1.setFirstName("Shivam");
//		c1.setLastName("Annadevara");
//		c1.setPermanentAddress("Delhi");
//		c1.setCommunicationAddress("Hyderabad");
//		c1.setPhone("0123456700");
//		c1.setStartingLocation("Delhi");
//		c1.setDestinationLocation("Hyderabad");
//		c1.setLocations("Delhi, Noida, Hyderabad");
//		c1.setPackageName("Fun Package");
//		c1.setCost(1000);
//		c1.setNotes("abcdefgh");
//
//		List<Customer> customers = new ArrayList<>();
//		for (int i = 1; i <= 9; i++) {
//			Customer c2 = new Customer();
//			c2.setId((long) 1);
//			c2.setFirstName("Srivalli " + i);
//			c2.setLastName("Annadevara " + i);
//			c2.setPermanentAddress("Andhara " + i);
//			c2.setCommunicationAddress("Hyderabad " + i);
//			c2.setPhone("012345678" + i);
//			c2.setStartingLocation("Andhara " + i);
//			c2.setDestinationLocation("Hyderabad " + i);
//			c2.setLocations("Andhara, Delhi, Hyderabad");
//			c2.setPackageName("Fun Package " + i);
//			c2.setCost(1000 + i);
//			c2.setNotes("abcdefgh " + i);
//
//			customers.add(c2);
//		}
//
//		log.info("saving customer c0 ->>>");
//		System.out.println(c0);
//		customerService.saveCustomer(c0);
//
//		log.info("saving customer c1 ->>>");
//		System.out.println(c1);
//		customerService.saveCustomer(c1);
//
//		for (Customer c : customers) {
//			log.info("saving customer c ->>>");
//			System.out.println(c);
//			customerService.saveCustomer(c);
//		}
	}
}

//Customer customer = new Customer();
//customer.setFirstName("Shivam");
//customer.setLastName("LNU");
//customer.setCommunicationAddress("sonipat");
//customer.setPermanentAddress("sonipat");
//customer.setPhone("0123456789");
//
//customerService.saveCustomer(customer);
//
//Customer customer1 = new Customer();
//customer1.setFirstName("Shivam");
//customer1.setLastName("Rathi");
//customer1.setCommunicationAddress("delhi");
//customer1.setPermanentAddress("delhi");
//customer1.setPhone("123456999");
//
//customerService.saveCustomer(customer1);
//
//Customer customer2 = new Customer();
//customer2.setFirstName("Akash");
//customer2.setLastName("Raturi");
//customer2.setPermanentAddress("meerut");
//customer2.setCommunicationAddress("meerut");
//customer2.setPhone("0123456799");
//
//customerService.saveCustomer(customer2);
//
//Customer customerById = customerService.findCustomerById((long) 1);
//log.info("logging customersById ->>>");
//System.out.println(customerById);
//
//List<Customer> customersByFirstName = customerService.findCustomerByFirstName("Shivam");
//log.info("logging customersByFirstName ->>>");
//System.out.println(customersByFirstName);
//
//Customer customerByPhone = customerService.findCustomerByPhone("0123456789");
//log.info("logging customerByPhone ->>>");
//System.out.println(customerByPhone);
//
//Customer update = customerService.findCustomerById((long) 2);
//log.info("logging update ->>>");
//System.out.println(update);
//update.setFirstName("Srivalli");
//customerService.updateCustomer(update);
//
//log.info("logging delete ->>>");
//customerService.deleteCustomerById((long) 1);