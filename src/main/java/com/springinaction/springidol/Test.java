package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springinaction/springidol/zhenbinspring.xml");
		/*Juggler juggler1=(Juggler) ac.getBean("duke");
		juggler1.perform();*/
		
		PoeticJuggler pj1=(PoeticJuggler) ac.getBean("poeticDuke");
		pj1.perform();
		
		Instrumentalist ins1=(Instrumentalist) ac.getBean("kenny");
		ins1.perform();
		//OneManBand omb=(OneManBand) ac.getBean("hank");
		//omb.perform();
		
	}

}
