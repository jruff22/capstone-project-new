package com.ruff.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ruff.springbootpostgresql.model.pet;
import com.ruff.springbootpostgresql.service.PetService;

@Controller
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@GetMapping("/pets")
	public String getPets(Model model) {
		List<pet> pets = petService.findAll();
		model.addAttribute("pets", pets);
		return "pet-list";
	}

}