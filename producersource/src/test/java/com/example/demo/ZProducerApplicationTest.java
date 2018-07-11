package com.example.demo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ZProducerApplicationTest</code> contains tests for the class <code>{@link ZProducerApplication}</code>.
 *
 * @generatedBy CodePro at 7/10/18 5:36 PM
 * @author sakumarp
 * @version $Revision: 1.0 $
 */
public class ZProducerApplicationTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/10/18 5:36 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		ZProducerApplication.main(args);
		
		

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is java.lang.SecurityException: Unable to create temporary file
		//       at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137)
		//       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537)
		//       at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122)
		//       at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693)
		//       at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118)
		//       at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107)
		//       at com.example.demo.ZProducerApplication.main(ZProducerApplication.java:11)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 5:36 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/10/18 5:36 PM
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
	 * @generatedBy CodePro at 7/10/18 5:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ZProducerApplicationTest.class);
	}
}