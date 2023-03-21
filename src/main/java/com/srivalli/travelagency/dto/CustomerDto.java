package com.srivalli.travelagency.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDto {
	private Long id;

	private String firstName;

	private String lastName;

	private String permanentAddress;

	private String communicationAddress;

	private String phone;

	private String startingLocation;

	private String destinationLocation;

	private String locations;

	private String packageName;

	private int cost;

	private String notes;
}
