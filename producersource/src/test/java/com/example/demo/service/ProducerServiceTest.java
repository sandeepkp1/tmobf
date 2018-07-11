package com.example.demo.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.bean.Employee;

/**
 * The class <code>ProducerServiceTest</code> contains tests for the class
 * <code>{@link ProducerService}</code>.
 *
 * @generatedBy CodePro at 7/9/18 2:46 PM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class ProducerServiceTest {

	@InjectMocks
	ProducerService producerService;

	@Mock
	Employee emp;

	/**
	 * Run the void add(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:46 PM
	 */
	@Test
	public void testAdd_1() throws Exception {
		/*
		 * ProducerService fixture = new ProducerService(); Employee emp = new
		 * Employee();
		 * 
		 * fixture.add(emp);
		 * 
		 * // add additional test code here // An unexpected exception was thrown in
		 * user code while executing this test: // java.lang.NullPointerException // at
		 * com.example.demo.service.ProducerService.add(ProducerService.java:25)
		 */
		/*
		 * ProducerService fixture = new ProducerService(); Employee emp = new
		 * Employee(); emp.setDept("it"); emp.setId("a1"); emp.setName("sandeep");
		 * emp.setSal(120); fixture.add(emp); //assertEquals(null, result);
		 * //Mockito.when(mongoRepo.findOne(Mockito.isA(String.class))).thenReturn(
		 * catalog); //assertEquals(fixture.,emp.toString());
		 * //Mockito.when(fixture.add(emp)).assertArrayEquals(expecteds, actuals);
		 */ Employee emp1 = new Employee();
		emp1.setDept("it");
		emp1.setId("a1");
		emp1.setName("sandeep");
		emp1.setSal(120);
		producerService.add(emp1);

	}

	/**
	 * Run the void add(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:46 PM
	 */

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 2:46 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 2:46 PM
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
	 * @generatedBy CodePro at 7/9/18 2:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerServiceTest.class);
	}
}