package com.cjc.hl.em.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.em.main.model.Cibil;
import com.cjc.hl.em.main.service.CibilService;
@CrossOrigin("*")
@RestController
public class CibilController {

	@Autowired
	private CibilService  cibilService;
	
	@PostMapping("/cibil/{panNo}")
	public ResponseEntity<String > createCibilScore(@RequestBody Cibil c,@PathVariable String panNo){
		
	
		return new ResponseEntity<String>(cibilService.createCibilScore(c,panNo),HttpStatus.OK);
		
	}
	@GetMapping(value = "getAllCibil")
	public ResponseEntity<List<Cibil>> getAllCibilScore(){
		return new ResponseEntity<List<Cibil>>(cibilService.getAllCibil(),HttpStatus.OK);
	}
	
	@GetMapping(value = "getApproveCList")
	public ResponseEntity<List<Cibil>> getApproveList(){
		
		return new ResponseEntity<List<Cibil>>(cibilService.getAllApoveList(),HttpStatus.OK); 
		
	}
}

