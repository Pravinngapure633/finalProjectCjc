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
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "abc")
	@SequenceGenerator( name = "abc",initialValue = 101,allocationSize =1 ,sequenceName = "enquiryId_seq")
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
	@OneToOne(cascade = CascadeType.ALL)
	private IncomeDetails incomeDetails;
	private String loanType;
	private String status;

	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enquiry(Integer enquiryId, LocalDate date, String firstName, String middleName, String lastName,
			String gender, String dob, String email, Long phoneNo, String panNo, Long adharNo, Double loanAmount,
			IncomeDetails incomeDetails, String loanType,String status) {
		super();
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
		this.incomeDetails = incomeDetails;
		this.loanType = loanType;
		this.status=status;
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", date=" + date + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", panNo=" + panNo + ", adharNo=" + adharNo + ", loanAmount=" + loanAmount
				+ ", incomeDetails=" + incomeDetails + ", loanType=" + loanType + ", status=" + status + "]";
	}

	
}
