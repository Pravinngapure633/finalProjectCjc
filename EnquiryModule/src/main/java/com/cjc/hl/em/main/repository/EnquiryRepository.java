package com.cjc.hl.em.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.em.main.dto.EnquiryAndIncomeDetailsDto;
import com.cjc.hl.em.main.model.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer> {

	Enquiry findBypanNo(String panNo);

	EnquiryAndIncomeDetailsDto save(EnquiryAndIncomeDetailsDto e);

	

}
