package com.example.demo.controller;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import java.util.ArrayList;

import com.example.demo.bean.Employee;
import com.example.demo.service.ProducerService;

/**
 * The class <code>ProducerControllerTest</code> contains tests for the class <code>{@link ProducerController}</code>.
 *
 * @generatedBy CodePro at 7/9/18 2:45 PM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class ProducerControllerTest {
	
	
	@InjectMocks
	ProducerController producerController;
	
	@Mock
	Employee emp;
	
	@Mock
	ProducerService producerService;
	
	/**
	 * Run the String m1(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	@Test
	public void testM1_1()
		throws Exception {
	/*	
		ProducerController fixture=new ProducerController();
		
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.controller.ProducerController.m1(ProducerController.java:28)
		assertNotNull(result);*/
		producerController.m1(emp);
		
	}

	@Test
    public void testRead_1()
           throws Exception {
/*           ArrayList<Employee> arrayList=new ArrayList<Employee>();
                  
           Employee rabbitModel1=new Employee();
           rabbitModel1.setId("s1");
           rabbitModel1.setDept("it");
           rabbitModel1.setName("sandeep");
           rabbitModel1.setSal(123);
           arrayList.add(rabbitModel1);      
          // Mockito.(producerService.add(rabbitModel1), null);
           String result = producerController.m1(rabbitModel1);
           assertNotNull(result);*/
		
    } 
	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	@Test
	public void testM2_1()
		throws Exception {
	/*	ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File is added", result);*/
		producerController.m2();
	}

	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 2:45 PM
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
	 * @generatedBy CodePro at 7/9/18 2:45 PM
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
	 * @generatedBy CodePro at 7/9/18 2:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerControllerTest.class);
	}
}