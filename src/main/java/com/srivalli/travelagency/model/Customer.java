package com.srivalli.travelagency.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "customer")
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
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

	@Column(name = "starting_location", nullable = false, unique = false)
	private String startingLocation;

	@Column(name = "destination_location", nullable = false, unique = false)
	private String destinationLocation;

	@Column(name = "locations", nullable = false, unique = false)
	private String locations;

	@Column(name = "package_name", nullable = false, unique = false)
	private String packageName;

	@Column(name = "cost", nullable = false, unique = false)
	private int cost;

	@Column(name = "notes", nullable = true, unique = false)
	private String notes;
}
