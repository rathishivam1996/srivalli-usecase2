package com.srivalli.travelagency.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
	@Min(value = 0L, message = "Id can not be negative")
	private Long id;

	@Pattern(regexp = "^[a-zA-Z ]$")
	private String firstName;

	@Pattern(regexp = "^[a-zA-Z ]$")
	private String lastName;

	@Min(value = 0, message = "Cost can not be negative")
	private int cost;

	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number should be of 10 digits")
	@NotBlank
	private String phone;

	@Pattern(regexp = "^[0-9a-zA-Z-/_\\s,]*[a-zA-Z]{3}[0-9a-zA-Z-/_\\s,]*$", message = "Invalid address format.")
	@NotBlank
	private String permanentAddress;

	@Pattern(regexp = "^[0-9a-zA-Z-/_\\s,]*[a-zA-Z]{3}[0-9a-zA-Z-/_\\s,]*$", message = "Invalid address format.")
	@NotBlank
	private String communicationAddress;

	@Pattern(regexp = "^[0-9a-zA-Z-/_\\s,]*[a-zA-Z]{3}[0-9a-zA-Z-/_\\s,]*$", message = "Invalid address format.")
	@NotBlank
	private String startingLocation;

	@Pattern(regexp = "^[0-9a-zA-Z-/_\\s,]*[a-zA-Z]{3}[0-9a-zA-Z-/_\\s,]*$", message = "Invalid address format.")
	@NotBlank
	private String destinationLocation;

	private String locations;

	private String packageName;

	private String notes;
}
