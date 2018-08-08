package com.lista.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackages = {"com.lista.lista.entity"})
@EnableJpaRepositories(basePackages = {"com.lista.lista.repository"})
@ComponentScan(basePackages = {"com.lista.lista.controller"})
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);
	}
}
