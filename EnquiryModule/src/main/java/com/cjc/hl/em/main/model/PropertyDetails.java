package com.cjc.hl.em.main.model;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class PropertyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addresss")
	@SequenceGenerator( name = "address",initialValue =801,allocationSize =1 ,sequenceName = "enquiryId_seq")
	private Integer propertyId;
	private String propertyName;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails propertyAddress;
	private Double estimatedAmount;


	public PropertyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PropertyDetails(Integer propertyId, String propertyName, AddressDetails propertyAddress,
			Double estimatedAmount) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyAddress = propertyAddress;
		this.estimatedAmount = estimatedAmount;
	}



	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public AddressDetails getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(AddressDetails propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(Double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}



	@Override
	public String toString() {
		return "PropertyDetails [propertyId=" + propertyId + ", propertyName=" + propertyName + ", propertyAddress="
				+ propertyAddress + ", estimatedAmount=" + estimatedAmount + "]";
	}

	
	

}
