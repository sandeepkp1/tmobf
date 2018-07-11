package com.example.demo.service;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.bean.Employee;

/**
 * The class <code>ConsumerServiceTest</code> contains tests for the class <code>{@link ConsumerService}</code>.
 *
 * @generatedBy CodePro at 7/10/18 11:18 AM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class ConsumerServiceTest {
	
	
	@InjectMocks
	 ConsumerService  consumerService;
	
	@Mock
	EmployeeRepo employeeRepo;
	/**
	 * Run the void queue2(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 11:18 AM
	 */
	@Test
	public void testQueue2_1()
		throws Exception {
		/*ConsumerService fixture = new ConsumerService();
		fixture.employeeRepo = null;
		Employee emp = new Employee();

		fixture.queue2(emp);*/

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.service.ConsumerService.queue2(ConsumerService.java:19)
		
		Employee emp = new Employee();
		Mockito.when(employeeRepo.save(Mockito.isA(Employee.class))).thenReturn(emp);
		consumerService.queue2(emp);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 11:18 AM
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
	 * @generatedBy CodePro at 7/10/18 11:18 AM
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
	 * @generatedBy CodePro at 7/10/18 11:18 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsumerServiceTest.class);
	}
}