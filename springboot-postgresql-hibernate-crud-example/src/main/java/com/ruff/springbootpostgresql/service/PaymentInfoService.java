package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.payment_info;
import com.ruff.springbootpostgresql.repository.PaymentInfoRepository;

@Service
public class PaymentInfoService {
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepo;
	
	private boolean existsById(Long id) {
		return paymentInfoRepo.existsById(id);
	}
		
		public List <payment_info> findAll() {
			List<payment_info> paymentInfo = paymentInfoRepo.findAll();
			return paymentInfo; 
		}
	}
