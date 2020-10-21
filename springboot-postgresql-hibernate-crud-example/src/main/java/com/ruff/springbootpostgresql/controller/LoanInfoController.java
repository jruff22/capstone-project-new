package com.ruff.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.loan_info;
import com.ruff.springbootpostgresql.service.LoanInfoService;

@Controller
public class LoanInfoController {
	
	@Autowired
	private LoanInfoService loanInfoService;
	

	
	@GetMapping ("/loan_info")
	public String getLoanInfo (Model model) {
		List<loan_info> loanInfo = loanInfoService.findAll();
		model.addAttribute("loan_info", loanInfo);
		return "loan_info";

}

}
