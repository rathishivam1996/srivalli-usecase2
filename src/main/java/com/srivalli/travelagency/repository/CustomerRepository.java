package com.srivalli.travelagency.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srivalli.travelagency.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<List<Customer>> findByFirstName(String firstName);

	Optional<Customer> findByPhone(String phone);

	Optional<Customer> findById(Long id);
}
