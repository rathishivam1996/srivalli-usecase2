package com.srivalli.travelagency.exceptionhandling;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.srivalli.travelagency.errorhandling.ErrorMessage;

@ControllerAdvice
public class TravelControllerAdvice {

	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ResponseEntity<ErrorMessage> integrityConstraintViolationException(
			SQLIntegrityConstraintViolationException ex) {
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.CONFLICT, new Date(), "Duplicate Record",
				"Phone Number Should be Unique");
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.CONFLICT);
	}

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<ErrorMessage> noSuchElementException(SQLIntegrityConstraintViolationException ex) {
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, new Date(), "Record not found",
				"Record not found");
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}
}
