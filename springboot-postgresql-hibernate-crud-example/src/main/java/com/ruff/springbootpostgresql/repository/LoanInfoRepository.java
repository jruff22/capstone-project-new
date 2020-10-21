package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruff.springbootpostgresql.model.loan_info;

public interface LoanInfoRepository extends JpaRepository<loan_info, Long> {

}
