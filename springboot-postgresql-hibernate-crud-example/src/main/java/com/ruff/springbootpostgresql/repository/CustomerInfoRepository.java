package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruff.springbootpostgresql.model.customer_info;

@Repository
public interface CustomerInfoRepository extends JpaRepository<customer_info, Long> {

}
