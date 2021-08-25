package com.example.concesionario;

import com.example.concesionario.Coche.infraestructure.CocheController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@ComponentScan(basePackageClasses = CocheController.class)
public class ConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionarioApplication.class, args);
	}

}
