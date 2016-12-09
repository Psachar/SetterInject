package com.praj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		PetOwner petOwner=(PetOwner)ctx.getBean("petOwner");
		petOwner.TamePet();
		

	}

}
