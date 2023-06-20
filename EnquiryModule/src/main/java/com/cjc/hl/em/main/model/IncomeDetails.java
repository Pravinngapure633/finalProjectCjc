package com.cjc.hl.em.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class IncomeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "incomeId")
	@SequenceGenerator( name = "incomeId",initialValue = 901,allocationSize =1 ,sequenceName = "incomeId_seq")
	private Integer incomeId;
	private String occupation;
	private String employerName;
	private String employmentType;
	private Double annualIncome;
	private Double otherIncome;
	
	
	public IncomeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
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



	public IncomeDetails(Integer incomeId, String occupation, String employerName, String employmentType,
			Double annualIncome, Double otherIncome) {
		super();
		this.incomeId = incomeId;
		this.occupation = occupation;
		this.employerName = employerName;
		this.employmentType = employmentType;
		this.annualIncome = annualIncome;
		this.otherIncome = otherIncome;
	}



	@Override
	public String toString() {
		return "IncomeDetails [incomeId=" + incomeId + ", occupation=" + occupation + ", employerName=" + employerName
				+ ", employmentType=" + employmentType + ", annualIncome=" + annualIncome + ", otherIncome="
				+ otherIncome + "]";
	}

	
	


}
