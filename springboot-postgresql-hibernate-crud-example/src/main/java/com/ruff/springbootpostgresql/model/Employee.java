package com.ruff.springbootpostgresql.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "employees")
public class Employee {

	@Id
	//            table_primary key name_seq
	@GeneratedValue(generator="employees_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "employees_id_seq",
			sequenceName="employees_id_seq",
			allocationSize=1
			)
	private Long id; 
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name= "last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=pet.class)
	private List<pet> pets;
	
	
	public List<pet> getPets() {
		if(this.pets == null) {
			this.pets = new ArrayList<pet>();
		}
		return this.pets;
	}
	

	public void setPets(List<pet> pets) {
		this.pets = pets;
	}

	//Constructors
	public Employee(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public Employee() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
}

