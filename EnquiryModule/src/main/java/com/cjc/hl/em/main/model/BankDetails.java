package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bank")
	@SequenceGenerator( name = "bank",initialValue = 601,allocationSize =1 ,sequenceName = "bankId_seq")
	private Integer bankId;
	private String bankName;
	private String branchName;
	private Long accountNo;
	private String ifscNo;
	private String accountType;
	private String accountHolderName;

	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankDetails(Integer bankId, String bankName, String branchName, Long accountNo, String ifscNo,
			String accountType, String accountHolderName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", accountNo=" + accountNo + ", ifscNo=" + ifscNo + ", accountType=" + accountType
				+ ", accountHolderName=" + accountHolderName + "]";
	}

}
