package com.ruff.springbootpostgresql.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "payment_info")
public class payment_info {
	
	@Id
	@GeneratedValue(generator="payment_info_payment_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "payment_info_payment_id_seq",
			sequenceName="payment_info_payment_id_seq",
			allocationSize=1
			)
	
	private Long payment_id;
	@Column(name = "loan_id")
	private long loan_id;
	@Column(name = "payment_amt")
	private Double payment_amt;
	@Column(name = "payment_date")
	private Date payment_date;
	@Column(name = "acct_type")
	private String acct_type;
	@Column(name = "payment_type")
	private String payment_type; 
	
	public payment_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public payment_info(Long payment_id, long loan_id, Double payment_amt, Date payment_date, String acct_type) {
		super();
		this.payment_id = payment_id;
		this.loan_id = loan_id;
		this.payment_amt = payment_amt;
		this.payment_date = payment_date;
		this.acct_type = acct_type;
		this.payment_type = payment_type;
	}

	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public Double getPayment_amt() {
		return payment_amt;
	}

	public void setPayment_amt(Double payment_amt) {
		this.payment_amt = payment_amt;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public String getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	
	
	
	}
	
	
