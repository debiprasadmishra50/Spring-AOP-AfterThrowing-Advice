package demo.spring.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.spring.aopdemo.dao.AccountDAO;

public class MainApplicationApp {
	
	public static void main(String[] args) {
		
		// read the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		accountDAO.addAccount(); // for Before Advice
		
		String findAccounts = null; // for either the AfterReturning or AfterThrowing Advice
		
		try{
			// add a boolean flag to simulate the exception
			boolean tripware = true; // Toggle this one true or false
			findAccounts = accountDAO.findAccounts(tripware); // will throw an exception as trip-ware is true
		}
		catch (Exception exc) {
			System.out.println("\n\nIn Main Program Caught Exception : "+exc);
		}
		
		System.out.println("\nIn Main Program : AfterThrowing Advice\n----------------------------\n"
				+ "Accounts are : "+findAccounts);
		
		// close the context
		context.close();
	}
}
