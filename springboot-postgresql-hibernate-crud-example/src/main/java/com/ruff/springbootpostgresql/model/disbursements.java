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
@Table(name = "disbursements")
public class disbursements {
	
	@Id
	@GeneratedValue(generator="disbursements_disbursement_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "disbursements_disbursement_id_seq",
			sequenceName="disbursements_disbursement_id_seq",
			allocationSize=1 )
	
	@Column(name = "disbursement_id")
	private long disbursement_id;		
	@Column(name = "loan_id")
	private long loan_id;
	@Column(name = "creditor")
	private String creditor;
	@Column(name = "amount_paid")
	private double amount_paid;
	@Column(name = "date_sent")
	private Date date_sent;
	@Column(name = "acct_number")
	private long acct_number;

	
	
	public disbursements() {
		super();
		// TODO Auto-generated constructor stub


	}

	

	public disbursements(long loan_id, String creditor, int amount_paid, Date date_sent, long acct_number) {
		super();
		this.loan_id = loan_id;
		this.creditor = creditor;
		this.amount_paid = amount_paid;
		this.date_sent = date_sent;
		this.acct_number = acct_number;
		
		
	}


	public long getLoan_id() {
		return loan_id;
	}


	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}


	public String getCreditor() {
		return creditor;
	}


	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}


	public double getAmount_paid() {
		return amount_paid;
	}


	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}


	public Date getDate_sent() {
		return date_sent;
	}


	public void setDate_sent(Date date_sent) {
		this.date_sent = date_sent;
	}


	public long getAcct_number() {
		return acct_number;
	}


	public void setAcct_number(long acct_number) {
		this.acct_number = acct_number;
	}


	public long getDisbursement_id() {
		return disbursement_id;
	}


	public void setDisbursement_id(long disbursement_id) {
		this.disbursement_id = disbursement_id;
	}

}
	