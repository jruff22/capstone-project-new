package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.disbursements;
import com.ruff.springbootpostgresql.repository.DisbursementsRepository;

@Service
public class DisbursementsService {
	
	@Autowired
	private DisbursementsRepository disbursementsRepo;
	
	private boolean existsById(Long id) {
		return disbursementsRepo.existsById(id);
	}
		
		public List <disbursements> findAll() {
			List<disbursements> disbursements = disbursementsRepo.findAll();
			return disbursements; 
		}
	}