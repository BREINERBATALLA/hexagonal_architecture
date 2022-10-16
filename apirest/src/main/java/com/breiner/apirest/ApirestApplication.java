package com.breiner.apirest;

import com.breiner.apirest.controllers.ConstructorInjectionController;
import com.breiner.apirest.controllers.PropertyInjectionController;
import com.breiner.apirest.controllers.SetterInjectionController;
import com.breiner.apirest.services.PropertyServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
	    ApplicationContext ctx= SpringApplication.run(ApirestApplication.class, args);

        SetterInjectionController sIC= (SetterInjectionController) ctx.getBean("setterInjectionController");

        ConstructorInjectionController cIC= (ConstructorInjectionController) ctx.getBean("constructorInjectionController");

        PropertyInjectionController pIC = (PropertyInjectionController) ctx.getBean("propertyInjectionController");

        System.out.println(pIC.getGreeting());
        System.out.println(sIC.getGreeting());
        System.out.println(cIC.getGreeting());
	}

}
