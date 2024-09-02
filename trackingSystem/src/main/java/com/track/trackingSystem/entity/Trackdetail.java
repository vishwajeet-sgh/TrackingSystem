package com.track.trackingSystem.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trackdetail")
public class Trackdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="track_number")
	private String trackNumber;
	
	@Column(name="origin_country_id")
	private String originCountryId;
	
	@Column(name="destination_country_id")
	private String destinationCountryId;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_slug")
	private String customerSlug;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}

	public String getOriginCountryId() {
		return originCountryId;
	}

	public void setOriginCountryId(String originCountryId) {
		this.originCountryId = originCountryId;
	}

	public String getDestinationCountryId() {
		return destinationCountryId;
	}

	public void setDestinationCountryId(String destinationCountryId) {
		this.destinationCountryId = destinationCountryId;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp date) {
		this.createdAt =  date;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSlug() {
		return customerSlug;
	}

	public void setCustomerSlug(String customerSlug) {
		this.customerSlug = customerSlug;
	}
	
	
	
}
