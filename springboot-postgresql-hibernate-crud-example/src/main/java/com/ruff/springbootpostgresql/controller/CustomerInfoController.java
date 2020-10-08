package com.ruff.springbootpostgresql.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.customer_info;
import com.ruff.springbootpostgresql.service.CustomerInfoService;

@Controller
public class CustomerInfoController {
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping ("/customerInfo")
	public String getCustomerInfo (Model model) {
		List<customer_info> customerInfo = customerInfoService.findAll();
		model.addAttribute("customerinfo", customerInfo);
		return "customerInfo";
		
	}


}
