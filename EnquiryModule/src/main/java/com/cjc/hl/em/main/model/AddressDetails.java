package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class AddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addresss")
	@SequenceGenerator( name = "address",initialValue =701,allocationSize =1 ,sequenceName = "addressId_seq")
	private Integer addressId;
	private String cityName;
	private String distName;
	private String state;
	private Long pincode;

	public AddressDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDetails(Integer addressId, String cityName, String distName, String state, Long pincode) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.distName = distName;
		this.state = state;
		this.pincode = pincode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDetails [addressId=" + addressId + ", cityName=" + cityName + ", distName=" + distName
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

	
}
