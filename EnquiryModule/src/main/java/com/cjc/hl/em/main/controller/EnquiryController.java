package com.cjc.hl.em.main.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.service.EnquiryService;

@RestController
@CrossOrigin("*")
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryService;

	@PostMapping(value = "/createEnquiry")
	public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enq) {

		enq.setDate(LocalDate.now());
		return new ResponseEntity<Enquiry>(enquiryService.createEnquiry(enq), HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllEnquiry")
	public ResponseEntity<List<Enquiry>> getAllEnquiry() {

		return new ResponseEntity<List<Enquiry>>(enquiryService.getAllEnquiry(), HttpStatus.OK);
	}

	@PutMapping(value = "/reRejection")
	public ResponseEntity<String> reRejection(@RequestBody Enquiry enquiry) {

		return new ResponseEntity<String>(enquiryService.reRejection(enquiry), HttpStatus.OK);

	}

	@PutMapping(value = "/Approved")
	public ResponseEntity<String> Approved(@RequestBody Enquiry enquiry) {

		return new ResponseEntity<String>(enquiryService.Approved(enquiry), HttpStatus.OK);

	}
	
	@GetMapping(value = "getApprovedList")
	public ResponseEntity<List<Enquiry>> getApproveList(){
		return new ResponseEntity<List<Enquiry>>(enquiryService.getApprovedList(),HttpStatus.OK);
	}
 
}

//@RequestMapping(value = "/saveEnquiry", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//public ResponseEntity<EnquiryAndIncomeDetailsDto> saveEnquiryAndIncomeDetail(@RequestPart(required = true,value ="incomeCertificate" ) MultipartFile f1,
//@RequestPart("doc") String doc)throws IOException
//{
//	EnquiryAndIncomeDetailsDto e=new EnquiryAndIncomeDetailsDto();
//	e.setIncomeCertificate(f1.getBytes());
//	
//	Gson g=new Gson();
//	
//	EnquiryAndIncomeDetailsDto i = g.fromJson(doc, EnquiryAndIncomeDetailsDto.class);
//	e.setEnquiryId(i.getEnquiryId());
//	e.setFirstName(i.getFirstName());
//	e.setMiddleName(i.getMiddleName());
//	e.setLastName(i.getLastName());
//	e.setGender(i.getGender());
//	e.setDob(i.getGender());
//	e.setEmail(i.getEmail());
//	e.setPhoneNo(i.getPhoneNo());
//	e.setPanNo(i.getPanNo());
//	e.setAdharNo(i.getAdharNo());
//	e.setLoanAmount(i.getLoanAmount());
//	e.setLoanType(i.getLoanType());
//	e.setEnquiryId(i.getEnquiryId());
//	e.setOccupation(i.getOccupation());
//	e.setEmployerName(i.getEmployerName());
//	e.setEmploymentType(i.getEmploymentType());
//	e.setAnnualIncome(i.getAnnualIncome());
//	e.setOtherIncome(i.getOtherIncome());
//	
//	return new ResponseEntity<EnquiryAndIncomeDetailsDto>(enquiryService.saveEnquiryAndIncomeDetails(e),HttpStatus.CREATED);
//	
//}
