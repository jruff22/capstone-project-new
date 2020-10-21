package com.ruff.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.statements;
import com.ruff.springbootpostgresql.service.StatementsService;

@Controller
public class StatmentController {
		
		@Autowired
		private StatementsService statementsService;
		
	
		@GetMapping ("/statements")
		public String getStatements (Model model) {
			List<statements> statementInfo = statementsService.findAll();
			model.addAttribute("statements", statementInfo);
			return "statements";

	}
}
