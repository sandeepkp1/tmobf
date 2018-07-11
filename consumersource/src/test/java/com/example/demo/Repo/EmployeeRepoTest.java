package com.example.demo.Repo;

import org.junit.*;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.example.demo.bean.Employee;

/**
 * The class <code>EmployeeRepoTest</code> contains tests for the class <code>{@link EmployeeRepo}</code>.
 *
 * @generatedBy CodePro at 7/10/18 11:11 AM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class EmployeeRepoTest {
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 11:11 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 11:11 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/10/18 11:11 AM
	 */
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmployeeRepoTest.class);
	}
}