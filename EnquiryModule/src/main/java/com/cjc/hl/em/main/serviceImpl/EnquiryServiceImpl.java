package com.cjc.hl.em.main.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.cjc.hl.em.main.dto.EnquiryAndIncomeDetailsDto;
import com.cjc.hl.em.main.model.Enquiry;
import com.cjc.hl.em.main.model.IncomeDetails;
import com.cjc.hl.em.main.repository.EnquiryRepository;
import com.cjc.hl.em.main.service.EnquiryService;
@Service
public class EnquiryServiceImpl  implements EnquiryService{
	
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Autowired
	private MailSender sender;

	@Override
	public Enquiry createEnquiry(Enquiry enq) {
		return enquiryRepository.save(enq);
	}

	@Override
	public List<Enquiry> getAllEnquiry() {
	
		return enquiryRepository.findAll();
	}

	@Override
	public EnquiryAndIncomeDetailsDto saveEnquiryAndIncomeDetails(EnquiryAndIncomeDetailsDto e) {
		
		
		return enquiryRepository.save(e);
	}

	@Override
	public String reRejection(Enquiry enquiry) {
		
		enquiry.setStatus("Rejected");
		
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(enquiry.getEmail());
		msg.setText("Your Application  is Rejected From RE Desc");
		sender.send(msg);
		
		enquiryRepository.save(enquiry);
		return "Saved";
	}
	
	@Override
	public String Approved(Enquiry enquiry) {
		
		enquiry.setStatus("Approved");
		
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(enquiry.getEmail());
		msg.setText("Your Application  is Approved From RE Desc");
		sender.send(msg);
		
		enquiryRepository.save(enquiry);
		return "Saved";
	}

	@Override
	public List<Enquiry> getApprovedList() {
	
		ArrayList<Enquiry> reList = new ArrayList<Enquiry>();
		List<Enquiry> findAll = enquiryRepository.findAll();
		
		Iterator<Enquiry> itr = findAll.iterator();
		while(itr.hasNext()) {
			Enquiry next = itr.next();
			if(next.getStatus()!=null) {
				if(next.getStatus().equals("Approved")) {
					reList.add(next);
				}
			}
		}
		return reList;
	}
	

	


}

//public Enquiry converToEntity(EnquiryAndIncomeDetailsDto d) {
//
//Enquiry e=new Enquiry();
//e.setEnquiryId(d.getEnquiryId());
//e.setFirstName(d.getFirstName());
//e.setMiddleName(d.getMiddleName());
//e.setLastName(d.getLastName());
//e.setGender(d.getGender());
//e.setDob(d.getGender());
//e.setEmail(d.getEmail());
//e.setPhoneNo(d.getPhoneNo());
//e.setPanNo(d.getPanNo());
//e.setAdharNo(d.getAdharNo());
//e.setLoanAmount(d.getLoanAmount());
//e.setLoanType(d.getLoanType());
//e.setEnquiryId(d.getEnquiryId());
//IncomeDetails a=new IncomeDetails();
//a.setIncomeId(d.getIncomeId());
//a.setOccupation(d.getOccupation());
//a.setEmployerName(d.getEmployerName());
//a.setEmploymentType(d.getEmploymentType());
//a.setAnnualIncome(d.getAnnualIncome());
//a.setOtherIncome(d.getOtherIncome());
//e.setIncomeDetails(a);
//return e;
//}
//
//public EnquiryAndIncomeDetailsDto convetToDto(Enquiry en) {
//EnquiryAndIncomeDetailsDto dd=new EnquiryAndIncomeDetailsDto();
//dd.setEnquiryId(en.getEnquiryId());
//dd.setFirstName(en.getFirstName());
//dd.setMiddleName(en.getMiddleName());
//dd.setLastName(en.getLastName());
//dd.setGender(en.getGender());
//dd.setDob(en.getGender());
//dd.setEmail(en.getEmail());
//dd.setPhoneNo(en.getPhoneNo());
//dd.setPanNo(en.getPanNo());
//dd.setAdharNo(en.getAdharNo());
//dd.setLoanAmount(en.getLoanAmount());
//dd.setLoanType(en.getLoanType());
//dd.setEnquiryId(en.getEnquiryId());
//
//return dd;
//}
