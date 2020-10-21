package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.loan_info;
import com.ruff.springbootpostgresql.repository.LoanInfoRepository;

@Service
public class LoanInfoService {
	
	@Autowired
	private LoanInfoRepository loanInfoRepo;
	
	private boolean existsById(Long id) {
		return loanInfoRepo.existsById(id);
	}
		
		public List <loan_info> findAll() {
			List<loan_info> loan_Info = loanInfoRepo.findAll();
			return loan_Info; 
		}
	}


