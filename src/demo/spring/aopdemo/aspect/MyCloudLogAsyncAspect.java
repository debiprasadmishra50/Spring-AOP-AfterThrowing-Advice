package demo.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyCloudLogAsyncAspect {
	
	@Before("execution(* demo.spring.aopdemo.dao.AccountDAO.add*())")
	public void performCloudLogAsync() {
		System.out.println("\n====> performing Cloud Log Async Aspect ");
	}
}
