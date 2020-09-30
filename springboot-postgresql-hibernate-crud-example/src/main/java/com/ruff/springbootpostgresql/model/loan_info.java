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
@Table(name = "loan_info")
public class loan_info {
	
	@Id
	@GeneratedValue(generator="loan_info_loan_info_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "loan_info_loan_info_seq",
			sequenceName="cloan_info_loan_info_seq",
			allocationSize=1
			)
	private long loan_info;
	@Column(name = "loan_info")
	private long loan_id;
	@Column(name = "loan_number")
	private long loan_number;
	@Column(name = "payment_due_date")
	private Date payment_due_date;
	@Column(name = "payment_amt")
	private double payment_amt;
	
	public loan_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public loan_info(long loan_id, long loan_number, Date payment_due_date, double payment_amt) {
		super();
		this.loan_id = loan_id;
		this.loan_number = loan_number;
		this.payment_due_date = payment_due_date;
		this.payment_amt = payment_amt;
	}

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public long getLoan_number() {
		return loan_number;
	}

	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}

	public Date getPayment_due_date() {
		return payment_due_date;
	}

	public void setPayment_due_date(Date payment_due_date) {
		this.payment_due_date = payment_due_date;
	}

	public double getPayment_amt() {
		return payment_amt;
	}

	public void setPayment_amt(double payment_amt) {
		this.payment_amt = payment_amt;
	}
	
	
	
	
	
}

