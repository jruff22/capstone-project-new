package com.ruff.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruff.springbootpostgresql.model.pet;
import com.ruff.springbootpostgresql.repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;
	
	public List<pet> findAll() { 
		List<pet> pets = petRepository.findAll();
		return pets;
	}
	
}
