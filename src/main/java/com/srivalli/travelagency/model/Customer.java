package com.srivalli.travelagency.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "customer")
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", nullable = false, unique = false)
	private String firstName;

	@Column(name = "last_name", nullable = false, unique = false)
	private String lastName;

	@Column(name = "permanent_address", nullable = false, unique = false)
	private String permanentAddress;

	@Column(name = "communication_address", nullable = false, unique = false)
	private String communicationAddress;

	@Column(name = "phone", nullable = false, unique = true)
	private String phone;

	@Column(name = "booking", nullable = true, unique = true)
	@OneToOne(mappedBy = "customer")
	private Booking booking;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Customer [" + "\n" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", permanentAddress=" + permanentAddress + ", communicationAddress=" + communicationAddress
				+ ", phone=" + phone + "\n" + "]";
	}

}

//@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid firstName ^[A-Za-z]*$")
//@Pattern(regexp = "^[A-Za-z]*$", message = "Invalid lastName ^[A-Za-z]*$")
//@Pattern(regexp = "^[0-9]{0,2}$", message = "invalid permanentAddress ^[a-zA-Z0-9]]{2,250}$")
//@Pattern(regexp = "^[a-zA-Z0-9]*$", message = "invalid communicationAddress ^[a-zA-Z0-9]]{2,250}$")
//@Pattern(regexp = "^[0-9]{10}", message = "invalid phone ^[0-9]{10}")
