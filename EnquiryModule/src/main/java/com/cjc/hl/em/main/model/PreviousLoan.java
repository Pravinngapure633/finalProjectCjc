package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PreviousLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "privious")
	@SequenceGenerator( name = "privious",initialValue = 1001,allocationSize =1 ,sequenceName = "priviousloanId_seq")
	private Integer previousLoanId;
	private String previousLoanStatus;
	private Integer loanId;

	public PreviousLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreviousLoan(Integer previousLoanId, String previousLoanStatus, Integer loanId) {
		super();
		this.previousLoanId = previousLoanId;
		this.previousLoanStatus = previousLoanStatus;
		this.loanId = loanId;
	}

	public Integer getPreviousLoanId() {
		return previousLoanId;
	}

	public void setPreviousLoanId(Integer previousLoanId) {
		this.previousLoanId = previousLoanId;
	}

	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}

	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	@Override
	public String toString() {
		return "PreviousLoan [previousLoanId=" + previousLoanId + ", previousLoanStatus=" + previousLoanStatus
				+ ", loanId=" + loanId + "]";
	}

}
