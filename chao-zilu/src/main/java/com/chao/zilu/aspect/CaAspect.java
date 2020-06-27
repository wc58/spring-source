package com.chao.zilu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CaAspect {

	@Pointcut("execution(* com.chao.zilu.service..*.*(..))")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		System.out.println("before ....");
	}

}
