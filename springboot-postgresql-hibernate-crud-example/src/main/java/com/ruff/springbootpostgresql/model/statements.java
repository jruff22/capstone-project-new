package com.ruff.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "statements")

public class statements {
	
		
		@Id
		@GeneratedValue(generator="statements_statement_id_seq", strategy=GenerationType.SEQUENCE)
		@SequenceGenerator(
				name = "statements_statement_id_seq",
				sequenceName="statements_statement_id_seq",
				allocationSize=1
				)
		private Long statement_id;
		
		@Column(name = "payment_amt")
		private Double payment_amt;
		
		@Column(name = "payment_date")
		private Date payment_date;
		
		@Column(name = "acct_number")
		private long acct_number;
		
		@Column(name = "loan_id")
		private long loan_id;
	
		
		
		public statements() {
			super();
			// TODO Auto-generated constructor stub
		}

		public statements(long statement_id, Double payment_amt, Date payment_date, long acct_number, long loan_id) {
			super();
			this.payment_date = payment_date;
			this.acct_number = acct_number;
			this.statement_id = statement_id;
			this.loan_id = loan_id;
		}

		public Long getStatement_id() {
			return statement_id;
		}

		public void setStatement_id(Long statement_id) {
			this.statement_id = statement_id;
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

		public long getAcct_number() {
			return acct_number;
		}

		public void setAcct_number(long acct_number) {
			this.acct_number = acct_number;
		}

		public long getLoan_id() {
			return loan_id;
		}

		public void setLoan_id(long loan_id) {
			this.loan_id = loan_id;
		}

		
		}
		
		

