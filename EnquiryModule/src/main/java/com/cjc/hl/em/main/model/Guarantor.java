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
public class Guarantor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gaurantor")
	@SequenceGenerator( name = "gaurantor",initialValue = 501,allocationSize =1 ,sequenceName = "gaurantorId_seq")
	private Integer guarantorId;
	private String guarantorFirstName;
	private String guarantorMiddleName;
	private String guarantorLastName;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails guarantorAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private IncomeDetails incomeDetails;

	public Guarantor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Guarantor(Integer guarantorId, String guarantorFirstName, String guarantorMiddleName,
			String guarantorLastName, AddressDetails guarantorAddress, IncomeDetails incomeDetails) {
		super();
		this.guarantorId = guarantorId;
		this.guarantorFirstName = guarantorFirstName;
		this.guarantorMiddleName = guarantorMiddleName;
		this.guarantorLastName = guarantorLastName;
		this.guarantorAddress = guarantorAddress;
		this.incomeDetails = incomeDetails;
	}



	public Integer getGuarantorId() {
		return guarantorId;
	}

	public void setGuarantorId(Integer guarantorId) {
		this.guarantorId = guarantorId;
	}

	public String getGuarantorFirstName() {
		return guarantorFirstName;
	}

	public void setGuarantorFirstName(String guarantorFirstName) {
		this.guarantorFirstName = guarantorFirstName;
	}

	public String getGuarantorMiddleName() {
		return guarantorMiddleName;
	}

	public void setGuarantorMiddleName(String guarantorMiddleName) {
		this.guarantorMiddleName = guarantorMiddleName;
	}

	public String getGuarantorLastName() {
		return guarantorLastName;
	}

	public void setGuarantorLastName(String guarantorLastName) {
		this.guarantorLastName = guarantorLastName;
	}

	

	public AddressDetails getGuarantorAddress() {
		return guarantorAddress;
	}



	public void setGuarantorAddress(AddressDetails guarantorAddress) {
		this.guarantorAddress = guarantorAddress;
	}



	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}



	@Override
	public String toString() {
		return "Guarantor [guarantorId=" + guarantorId + ", guarantorFirstName=" + guarantorFirstName
				+ ", guarantorMiddleName=" + guarantorMiddleName + ", guarantorLastName=" + guarantorLastName
				+ ", guarantorAddress=" + guarantorAddress + ", incomeDetails=" + incomeDetails + "]";
	}

	
	

}
