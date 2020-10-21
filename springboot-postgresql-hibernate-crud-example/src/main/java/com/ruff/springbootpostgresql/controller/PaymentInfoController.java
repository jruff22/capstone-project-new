package com.ruff.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.payment_info;
import com.ruff.springbootpostgresql.service.PaymentInfoService;

@Controller
public class PaymentInfoController {
	
	@Autowired
	private PaymentInfoService paymentInfoService;
	
	
	@GetMapping ("/paymentInfo")
	public String getPaymentInfo (Model model) {
		List<payment_info> paymentInfo = paymentInfoService.findAll();
		model.addAttribute("paymentInfo", paymentInfo);
		return "paymentInfo";

}

}

