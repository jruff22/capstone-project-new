package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.statements;
import com.ruff.springbootpostgresql.repository.StatementsRepository;

@Service
public class StatementsService {
	
	@Autowired
	private StatementsRepository statementsRepo;
	
	private boolean existsById(Long id) {
		return statementsRepo.existsById(id);
	}
		
		public List <statements> findAll() {
			List<statements> statements = statementsRepo.findAll();
			return statements; 
		}
	}
