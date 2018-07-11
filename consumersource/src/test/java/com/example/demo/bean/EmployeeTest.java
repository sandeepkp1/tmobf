package com.example.demo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;


/**
 * The class <code>EmployeeTest</code> contains tests for the class <code>{@link Employee}</code>.
 *
 * @generatedBy CodePro at 7/10/18 11:01 AM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class EmployeeTest 
 {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 7/10/18 11:01 AM
	 */

	@InjectMocks
	Employee employee;
	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/10/18 11:01 AM
	 */
	
	@Test
	public void testGetDept_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String result = fixture.getDept();

		// add additional test code here
		assertEquals("it", result);
	}
	
	@Test
	public void testGetId_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String result = fixture.getId();

		// add additional test code here
		assertEquals("a1", result);
	}
	
	@Test
	public void testGetName_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String result = fixture.getName();

		// add additional test code here
		assertEquals("sandeep", result);
	}
	
	@Test
	public void testGetSal_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		int result = fixture.getSal();

		// add additional test code here
		assertEquals(120, result);
	}
	
	@Test
	public void testSetDept_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String dept = "it";

		fixture.setDept(dept);

		// add additional test code here
	}

	
	@Test
	public void testSetId_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String id = "a1";

		fixture.setId(id);

		// add additional test code here
	}

	
	@Test
	public void testSetName_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		String name = "sandeep";

		fixture.setName(name);

		// add additional test code here
	}

	
	@Test
	public void testSetSal_1() throws Exception {
		Employee fixture = new Employee();
		fixture.setDept("it");
		fixture.setId("a1");
		fixture.setName("sandeep");
		fixture.setSal(120);
		int sal = 120;

		fixture.setSal(sal);

		// add additional test code here
	}
	
	
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}
	
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmployeeTest.class);
	}
}