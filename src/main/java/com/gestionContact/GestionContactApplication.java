package com.gestionContact;

import com.gestionContact.util.GenerateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GestionContactApplication //implements CommandLineRunner
{

	/*@Autowired
	private GenerateData generateData;*/

	public static void main(String[] args) {
		SpringApplication.run(GestionContactApplication.class, args);
	}

	/*
	Pour la generation du data
	@Override
	public void run(String... args) throws Exception {
		generateData.generateContact();
	}*/

}
