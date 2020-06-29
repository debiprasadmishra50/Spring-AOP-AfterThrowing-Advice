package demo.spring.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	// add a new method
	public String findAccounts(boolean tripware) {
		
		if(tripware) {
			throw new RuntimeException("Exception Thrown In AccountDAO findAccount as tripware is true");
		}
		
		System.out.println("\n\nList of Accounts : findAccounts() method in AccountDAO");
		return "Account 1, Account 2, Account 3";
	}
	
	public void addAccount() {
		System.out.println("\n"+getClass()+" : DOING MY DB WORK : ADDING AN ACCOUNT\n\n\n\n\n");
	}
}
