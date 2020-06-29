package demo.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {
	
	@Before("execution(public void demo.spring.aopdemo.dao.AccountDAO.addAccount())")
	public void performApiAnalysis() {
		System.out.println("\n====> performing API Analysis ");
	}
}
