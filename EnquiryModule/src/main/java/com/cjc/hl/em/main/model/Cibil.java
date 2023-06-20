package com.cjc.hl.em.main.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Cibil {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cibilId")
	@SequenceGenerator(name = "cibilId", initialValue = 201, allocationSize = 1, sequenceName = "cibilId_seq")
	private Integer cibilId;
	private Integer enquiryId;
	private String panNo;
	private Long cibilScore;
	private LocalDate cibilDate;
	private String cibilRemark;

	public Cibil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cibil(Integer cibilId, Integer enquiryId, String panNo, Long cibilScore, LocalDate cibilDate,
			String cibilRemark) {
		super();
		this.cibilId = cibilId;
		this.enquiryId = enquiryId;
		this.panNo = panNo;
		this.cibilScore = cibilScore;
		this.cibilDate = cibilDate;
		this.cibilRemark = cibilRemark;
	}

	public Integer getCibilId() {
		return cibilId;
	}

	public void setCibilId(Integer cibilId) {
		this.cibilId = cibilId;
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Long getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(Long cibilScore) {
		this.cibilScore = cibilScore;
	}

	public LocalDate getCibilDate() {
		return cibilDate;
	}

	public void setCibilDate(LocalDate cibilDate) {
		this.cibilDate = cibilDate;
	}

	public String getCibilRemark() {
		return cibilRemark;
	}

	public void setCibilRemark(String cibilRemark) {
		this.cibilRemark = cibilRemark;
	}

	@Override
	public String toString() {
		return "Cibil [cibilId=" + cibilId + ", enquiryId=" + enquiryId + ", panNo=" + panNo + ", cibilScore="
				+ cibilScore + ", cibilDate=" + cibilDate + ", cibilRemark=" + cibilRemark + "]";
	}

	
}
