package com.ruff.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.disbursements;
import com.ruff.springbootpostgresql.service.DisbursementsService;

@Controller
public class DisbursementController {
	
	@Autowired
	private DisbursementsService disbursementService;
	
	
	@GetMapping ("/disbursements")
	public String getDisbursementInfo (Model model) {
		List<disbursements> disbursementInfo = disbursementService.findAll();
		model.addAttribute("disbursements", disbursementInfo);
		return "disbursements";

}

}