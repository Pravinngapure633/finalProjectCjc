package com.cjc.hl.em.main.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registration_Seq")
	@SequenceGenerator(name = "registration_Seq", initialValue = 301, allocationSize = 1, sequenceName = "registrationId_Seq")
	private Integer registrationId;
	private Integer enquiryId;
	private LocalDate date;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dob;
	private String email;
	private Long phoneNo;
	private String panNo;
	private Long adharNo;
	private Double loanAmount;
	private String loanType;
	private String status;
	private String cmStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressDetails addressDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDetails propertyDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private IncomeDetails incomeDetails;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(Integer registrationId, Integer enquiryId, LocalDate date, String firstName, String middleName,
			String lastName, String gender, String dob, String email, Long phoneNo, String panNo, Long adharNo,
			Double loanAmount, String loanType, String status, String cmStatus, PreviousLoan previousLoan,
			Guarantor guarantor, BankDetails bankDetails, AddressDetails addressDetails,
			PropertyDetails propertyDetails, IncomeDetails incomeDetails) {
		super();
		this.registrationId = registrationId;
		this.enquiryId = enquiryId;
		this.date = date;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phoneNo = phoneNo;
		this.panNo = panNo;
		this.adharNo = adharNo;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.status = status;
		this.cmStatus = cmStatus;
		this.previousLoan = previousLoan;
		this.guarantor = guarantor;
		this.bankDetails = bankDetails;
		this.addressDetails = addressDetails;
		this.propertyDetails = propertyDetails;
		this.incomeDetails = incomeDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public PreviousLoan getPreviousLoan() {
		return previousLoan;
	}

	public void setPreviousLoan(PreviousLoan previousLoan) {
		this.previousLoan = previousLoan;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}

	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public IncomeDetails getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(IncomeDetails incomeDetails) {
		this.incomeDetails = incomeDetails;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCmStatus() {
		return cmStatus;
	}

	public void setCmStatus(String cmStatus) {
		this.cmStatus = cmStatus;
	}

	@Override
	public String toString() {
		return "Registration [registrationId=" + registrationId + ", enquiryId=" + enquiryId + ", date=" + date
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender="
				+ gender + ", dob=" + dob + ", email=" + email + ", phoneNo=" + phoneNo + ", panNo=" + panNo
				+ ", adharNo=" + adharNo + ", loanAmount=" + loanAmount + ", loanType=" + loanType + ", status="
				+ status + ", cmStatus=" + cmStatus + ", previousLoan=" + previousLoan + ", guarantor=" + guarantor
				+ ", bankDetails=" + bankDetails + ", addressDetails=" + addressDetails + ", propertyDetails="
				+ propertyDetails + ", incomeDetails=" + incomeDetails + "]";
	}

}
