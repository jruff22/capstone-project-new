package com.ruff.springbootpostgresql.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class EmployeeTest {
	
	protected static Employee felix;
	protected static String fname = "Felix"; 
	protected static String lname = "D' Cat";
	protected static String email = "felixrox@aol.com";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Employee(fname, lname, email );
		
	}

	@Test
	@Order(1)
	void employee_GivenThreeParameters_ShouldConstrctEmployee() {
		assertTrue(felix instanceof Employee);
		assertEquals(0, felix.getId());
		assertEquals(fname, felix.getFirstName());
		assertEquals(lname, felix.getLastName());
		assertEquals(email, felix.getEmail());
	}
	@Test
	@Order(2)
	void setId_GivenLong_ShouldSetId() {
		long fakeId = 100; 
		felix.setId(fakeId);
		assertEquals(fakeId, felix.getId()); 
	}
	
}


