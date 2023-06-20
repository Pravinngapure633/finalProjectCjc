package com.cjc.hl.em.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;
import com.cjc.hl.em.main.repository.EnquiryRepository;
import com.cjc.hl.em.main.repository.IncomeDetailsRepository;
import com.cjc.hl.em.main.service.IncomeDetailsService;
@Service
public class IncomeDetailsServiceImpl  implements IncomeDetailsService{
	
	@Autowired
	private IncomeDetailsRepository incomeDetailsRepository;
	
	@Autowired
	private EnquiryRepository enquiryRepo;

//	@Override
//	public IncomeDetails addIncomeDetails(IncomeDetails incd) {
//		
//		return incomeDetailsRepository.save(incd);
//	}
//
//	@Override
//	public IncomeDetails saveIncomeDetailsWithSpecificEnquiryId(IncomeDetails incd) {
//		
//		Integer enquiryId = incd.getEnquiryId();
//		
//		Enquiry enquiry = enquiryRepo.findById(enquiryId).get();
//		if(enquiry.getEnquiryId()==enquiryId) {
//			enquiry.setIncomeDetails(incd);
//		return 	incomeDetailsRepository.save(incd);
//			
//		}
//		
//		return incomeDetailsRepository.save(incd);
//	}
	
	
	
	

}
