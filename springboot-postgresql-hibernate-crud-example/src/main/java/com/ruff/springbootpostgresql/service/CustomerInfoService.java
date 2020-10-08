package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.customer_info;
import com.ruff.springbootpostgresql.repository.CustomerInfoRepository;

@Service
public class CustomerInfoService {
	
	@Autowired
	private CustomerInfoRepository customerInfoRepo;
	
	private boolean existsById(Long id) {
		return customerInfoRepo.existsById(id);
	}
		
		public List <customer_info> findAll() {
			List<customer_info> customerInfo = customerInfoRepo.findAll();
			return customerInfo; 
		}
	}


