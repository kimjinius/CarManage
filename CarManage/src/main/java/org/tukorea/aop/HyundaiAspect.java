package org.tukorea.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tukorea.myweb.domain.SaleVO;
import org.tukorea.myweb.service.SaleService;

@Aspect
@Component
public class HyundaiAspect {
	@Autowired
	SaleService saleService;
	
	@Before("execution(* saleAdd(..))")
	public void beforeMethod(JoinPoint jp) throws Exception{
		System.out.println("[beforeMethod] : 메소드 호출 전");
		Signature sig = jp.getSignature();
		System.out.println("메소드 이름:" + sig.getName());
		Object[] obj = jp.getArgs();
		System.out.println("인수 값:" + obj[0]);
		System.out.println(jp);
		SaleVO sale = (SaleVO)obj[0];
		sale.setSaleCarNumber(saleService.createCarNum());
	}


}


