package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruff.springbootpostgresql.model.statements;

public interface StatementsRepository extends JpaRepository<statements, Long> {

}
