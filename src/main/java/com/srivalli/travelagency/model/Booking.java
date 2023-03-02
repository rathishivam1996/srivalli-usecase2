//package com.srivalli.travelagency.model;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity(name = "booking")
//@Table(name = "booking")
//public class Booking {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	@Column(name = "starting_location", nullable = false, unique = false)
//	private String startingLocation;
//
//	@Column(name = "destination_location", nullable = false, unique = false)
//	private String destinationLocation;
//
////	@Column(name = "locations", nullable = false, unique = false)
////	private List<Location> locations;
//
//	@Column(name = "package_name", nullable = false, unique = false)
//	private String packageName;
//
//	@Column(name = "cost", nullable = false, unique = false)
//	private int cost;
//
//	@Column(name = "notes", nullable = false, unique = false)
//	private String notes;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id", referencedColumnName = "id")
//	@Column(nullable = false, unique = true)
//	private Customer customer;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getStartingLocation() {
//		return startingLocation;
//	}
//
//	public void setStartingLocation(String startingLocation) {
//		this.startingLocation = startingLocation;
//	}
//
//	public String getDestinationLocation() {
//		return destinationLocation;
//	}
//
//	public void setDestinationLocation(String destinationLocation) {
//		this.destinationLocation = destinationLocation;
//	}
//
//	public String getPackageName() {
//		return packageName;
//	}
//
//	public void setPackageName(String packageName) {
//		this.packageName = packageName;
//	}
//
//	public int getCost() {
//		return cost;
//	}
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//	public String getNotes() {
//		return notes;
//	}
//
//	public void setNotes(String notes) {
//		this.notes = notes;
//	}
//
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//	// public List<Location> getLocations() {
//	// return locations;
//	// }
//	//
//	// public void setLocations(List<Location> locations) {
//	// this.locations = locations;
//	// }
//
//	@Override
//	public String toString() {
//		return "Booking [id=" + id + ", startingLocation=" + startingLocation + ", destinationLocation="
//				+ destinationLocation + ", locattions=" + ", packageName=" + packageName + ", cost=" + cost + ", notes="
//				+ notes + "]";
//	}
//}
