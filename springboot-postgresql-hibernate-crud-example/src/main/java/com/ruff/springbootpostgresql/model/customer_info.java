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
@Table(name = "customer_info")
public class customer_info {
	//create controller, interface, service - mimic employee list 
	//STEPS for your customer_info.java
	//Using Employee as a reference:
	//	1) Create Repository interface
	//	2) Create Controller class
	//	3) Create Service class
	//	4) Create customer_info_list.html
	//	5) Change application.properties to point to your capstone Postgres database
	
	@Id
	@GeneratedValue(generator="customer_info_customer_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "customer_info_customer_id_seq",
			sequenceName="customer_info_customer_id_seq",
			allocationSize=1
			)
	
	private long customer_id;
	@Column(name = "loan_id")
	private long loan_id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "ssn")
	private long ssn;
	
	public customer_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public customer_info(long loan_id, String first_name, String last_name, Date birthdate, long ssn) {
		super();
		this.loan_id = loan_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birthdate = birthdate;
		this.ssn = ssn;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	
	
	
	


	
	
}
