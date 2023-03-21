package com.srivalli.travelagency.dto;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class AddressValidationTests {
	private static ValidatorFactory validatorFactory;
	private static Validator validator;

	private static CustomerDto customerDto;

	@BeforeAll
	public static void createValidator() {
		System.out.println("@BeforeAll ->>>");
		validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();

		customerDto = CustomerDto.builder().id((long) 1).phone("0123456789").firstName("Srivalli")
				.lastName("Annadevara").communicationAddress("Hyderabad").startingLocation("Andhra")
				.destinationLocation("Hyderabad").locations("Andhra, Hyderabad").packageName("Don't Know").cost(1000)
				.notes("nothing").build();
	}

	@AfterAll
	public static void close() {
		System.out.println("@AfterAll ->>>");
		validatorFactory.close();
	}

	@Test
	public void addressLengthShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa");
		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with alpha");
		System.out.println(violations.toString());
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressContainsAlphaNumericShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa65");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with alpha-numeric");
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressContainsHyphenShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa-");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with hyphen");
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressContainsSlashShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa/");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with slash");
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressContainsSpaceShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa ");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with space");
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressContainsCommaShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("goa,");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with comma");
		assertTrue(violations.isEmpty());
	}

	@Test
	public void addressShouldPass() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("Wz-65, Phase-2, Om Vihar, Uttam Nagar, New Delhi, Delhi - 110059");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertTrue(violations.isEmpty());
	}

	// negative test cases

	@Test
	public void addressLengthShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("a");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressLessThenThreeAlphaShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("123a");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressOnlyNumericShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("1234");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressOnlySpecialCharsShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("-/ -/");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressOnlySpacesShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("     ");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressBlankShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress(" ");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressContainsSpecialCharsShouldFail() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("Wz-65 @");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with special chars");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressContainsSpecialCharsShouldFail1() {
		log.info("@Test ->>>");
		CustomerDto customerDto = new CustomerDto();
		customerDto.setPermanentAddress("Wz-65 #");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with special chars");
		assertFalse(violations.isEmpty());
	}

	@Test
	public void addressContainsSpecialCharsShouldFail2() {
		log.info("@Test ->>>");
		customerDto.setPermanentAddress("Wz-65 :");

		Set<ConstraintViolation<CustomerDto>> violations = validator.validate(customerDto);
		System.out.println("testing address with special chars");
		assertFalse(violations.isEmpty());
	}
}
