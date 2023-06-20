package com.cjc.hl.em.main.dto;

import java.util.Arrays;

import javax.persistence.Lob;

public class EnquiryAndIncomeDetailsDto {
	
	
	private Integer enquiryId;
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

	private Integer incomeId;
	private String occupation;
	private String employerName;
	private String employmentType;
	private Double annualIncome;
	private Double otherIncome;
	@Lob
	private byte[] incomeCertificate;
	
//	
//	{
//		"firstName":"XYZ",
//		"middleName":"A",
//		"lastName":"ABC",
//		"gender":"male",
//		"dob":"22/5/99",
//		"email":"xyz@gmail.com",
//		"phoneNo":954552666,
//		"panNo":"adaaf23",
//		"adharNo":456632100,
//		"loanAmount":895623.02,
//		"loanType":"hhh",
//		"occupation":"mba",
//		"employerName":"hgh",
//		"employmentType":"sfsfsfs",
//		"annualIncome":12356.00.
//		"otherIncome":5644.00
//		
//	}
//	
	
	
	
	public EnquiryAndIncomeDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EnquiryAndIncomeDetailsDto(Integer enquiryId, String firstName, String middleName, String lastName,
		String gender, String dob, String email, Long phoneNo, String panNo, Long adharNo, Double loanAmount,
		String loanType, Integer incomeId, String occupation, String employerName, String employmentType,
		Double annualIncome, Double otherIncome, byte[] incomeCertificate) {
	super();
	this.enquiryId = enquiryId;
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
	this.incomeId = incomeId;
	this.occupation = occupation;
	this.employerName = employerName;
	this.employmentType = employmentType;
	this.annualIncome = annualIncome;
	this.otherIncome = otherIncome;
	this.incomeCertificate = incomeCertificate;
}


	
	public Integer getIncomeId() {
		return incomeId;
	}


	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
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
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public Double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public Double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(Double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public byte[] getIncomeCertificate() {
		return incomeCertificate;
	}
	public void setIncomeCertificate(byte[] incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}
	@Override
	public String toString() {
		return "EnquiryAndIncomeDetailsDto [enquiryId=" + enquiryId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", panNo=" + panNo + ", adharNo=" + adharNo + ", loanAmount=" + loanAmount
				+ ", loanType=" + loanType + ", occupation=" + occupation + ", employerName=" + employerName
				+ ", employmentType=" + employmentType + ", annualIncome=" + annualIncome + ", otherIncome="
				+ otherIncome + ", incomeCertificate=" + Arrays.toString(incomeCertificate) + "]";
	}
	
	
	
	
	
	

}
