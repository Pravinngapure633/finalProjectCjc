package com.cjc.hl.em.main.service;

import java.util.List;

import com.cjc.hl.em.main.dto.EnquiryAndIncomeDetailsDto;
import com.cjc.hl.em.main.model.Enquiry;

public interface EnquiryService {

	Enquiry createEnquiry(Enquiry enq);

	List<Enquiry> getAllEnquiry();

	EnquiryAndIncomeDetailsDto saveEnquiryAndIncomeDetails(EnquiryAndIncomeDetailsDto e);

	String reRejection(Enquiry enquiry);

	String Approved(Enquiry enquiry);

	List<Enquiry> getApprovedList();

}
