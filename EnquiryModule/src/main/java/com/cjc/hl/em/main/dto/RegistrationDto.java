package com.cjc.hl.em.main.dto;

import com.cjc.hl.em.main.model.AddressDetails;
import com.cjc.hl.em.main.model.IncomeDetails;

public class RegistrationDto {
	
	
	private Integer registrationId;
	private Integer enquiryId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dob;
	private String email;
	private Long phoneNo;
	private String panNo;
	private String adharNo;
	private Double loanAmount;
	private String Occuption;
	//priviousloan
	private Integer previousLoanId;
	private String previousLoanStatus;
	private Integer loanId;
	
	//Document
	private Integer documentId;
	private byte[] adharCard;
	private byte[] panCard;
	private byte[] photo;
	private byte[] sign;
	private byte[] salarySlip;
	private byte[] ITR;
	private byte[] bankPass;
	
	//gaurantor
	private Integer guarantorId;
	private String guarantorFirstName;
	private String guarantorMiddleName;
	private String guarantorLastName;
	private String guarantorAddress;
	private byte[] guarantorSign;
	private byte[] guarantorBankPass;
	private IncomeDetails ioncomeDetails;
	
	//bank
	private Integer bankId;
	private String bankName;
	private String branchName;
	private Long accountNo;
	private String ifscNo;
	private String accountType;
	private String accountHolderName;
	
	//address
	private Integer addressId;
	private String cityName;
	private String distName;
	private String state;
	private Long pincode;

	//poperty
	private Integer propertyId;
	private String propertyName;
	private AddressDetails propertyAddress;
	private String estimatedAmount;
	private byte[] propertyDocument;



}
