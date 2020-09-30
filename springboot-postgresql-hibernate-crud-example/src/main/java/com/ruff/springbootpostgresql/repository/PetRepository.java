package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruff.springbootpostgresql.model.pet;

public interface PetRepository extends JpaRepository <pet, Long> {

}
