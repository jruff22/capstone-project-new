package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruff.springbootpostgresql.model.disbursements;

public interface DisbursementsRepository extends JpaRepository<disbursements, Long> {

}
