package com.example.demo.bean;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


/**
 * The class <code>EmployeeTest</code> contains tests for the class
 * <code>{@link Employee}</code>.
 *
 * @generatedBy CodePro at 7/9/18 2:45 PM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class EmployeeTest {

	@InjectMocks
	Employee employee;

	/**
	 * Run the Employee() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	/*
	 * @Test public void testEmployee_1() throws Exception {
	 * 
	 * Employee result = new Employee();
	 * 
	 * // add additional test code here assertNotNull(result);
	 * assertEquals("Employee [id=null, name=null, sal=0, dept=null]",
	 * result.toString()); assertEquals(null, result.getName()); assertEquals(null,
	 * result.getId()); assertEquals(null, result.getDept()); assertEquals(0,
	 * result.getSal()); }
	 */
	/**
	 * Run the Employee(String,String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	/*
	 * @Test public void testEmployee_2() throws Exception { String id = ""; String
	 * name = ""; int sal = 1; String dept = "";
	 * 
	 * Employee result = new Employee(id, name, sal, dept);
	 * 
	 * // add additional test code here assertNotNull(result);
	 * assertEquals("Employee [id=, name=, sal=1, dept=]", result.toString());
	 * assertEquals("", result.getName()); assertEquals("", result.getId());
	 * assertEquals("", result.getDept()); assertEquals(1, result.getSal()); }
	 */

	/**
	 * Run the String getDept() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
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

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the int getSal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the void setDept(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the void setSal(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
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

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	/*
	 * @Test public void testToString_1() throws Exception { Employee fixture = new
	 * Employee(); fixture.setDept("it"); fixture.setId("a1");
	 * fixture.setName("sandeep"); fixture.setSal(120);
	 * 
	 * String result = fixture.toString();
	 * 
	 * // add additional test code here
	 * assertEquals("Employee [id=, name=, sal=1, dept=]", result); }
	 */

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
		//MockitoAnnotations.initMocks(this);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmployeeTest.class);
	}
}