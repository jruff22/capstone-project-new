package com.ruff.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruff.springbootpostgresql.model.payment_info;

public interface PaymentInfoRepository extends JpaRepository<payment_info, Long> {

}
