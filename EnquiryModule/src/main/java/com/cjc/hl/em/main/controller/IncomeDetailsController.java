package com.cjc.hl.em.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.em.main.model.IncomeDetails;
import com.cjc.hl.em.main.service.IncomeDetailsService;
import com.google.gson.Gson;

@RestController
@CrossOrigin("*")

public class IncomeDetailsController {

	@Autowired
	private IncomeDetailsService incomeDetailsService;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//
//	@RequestMapping(value = "/addIncomeDetail", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ResponseEntity<IncomeDetails> createIncomeDetails(
//			@RequestPart(required = true, value = "incomeCertificate") MultipartFile f1, 
//			@RequestPart("doc") String doc)
//			throws IOException {
//
//		IncomeDetails incd = new IncomeDetails();
//
//		incd.setIncomeCertificate(f1.getBytes());
//
//		Gson g = new Gson();
//
//		IncomeDetails inc = g.fromJson(doc, IncomeDetails.class);
//
//		incd.setEmployerName(inc.getEmployerName());
//		incd.setEmploymentType(inc.getEmploymentType());
//		incd.setOccupation(inc.getOccupation());
//		incd.setAnnualIncome(inc.getAnnualIncome());
//		incd.setOtherIncome(inc.getOtherIncome());
//
//		return new ResponseEntity<>(incomeDetailsService.addIncomeDetails(incd), HttpStatus.CREATED);
//	}
	
//	@RequestMapping(value = "/addIncomeDetail", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public ResponseEntity<IncomeDetails> saveIncomeDetailsWithSpecificEnquiryId(
//			@RequestPart(required = true, value = "incomeCertificate") MultipartFile f1, 
//			@RequestPart("doc") String doc) throws IOException{
//		
//		
//		IncomeDetails incd = new IncomeDetails();
//
//		incd.setIncomeCertificate(f1.getBytes());
//
//		Gson g = new Gson();
//
//		IncomeDetails inc = g.fromJson(doc, IncomeDetails.class);
//
//		incd.setEmployerName(inc.getEmployerName());
//		incd.setEmploymentType(inc.getEmploymentType());
//		incd.setOccupation(inc.getOccupation());
//		incd.setAnnualIncome(inc.getAnnualIncome());
//		incd.setOtherIncome(inc.getOtherIncome());
//		incd.setEnquiryId(inc.getEnquiryId());
//		
//		return new ResponseEntity<IncomeDetails>(incomeDetailsService.saveIncomeDetailsWithSpecificEnquiryId(incd),HttpStatus.CREATED);
//		
//	}
}
