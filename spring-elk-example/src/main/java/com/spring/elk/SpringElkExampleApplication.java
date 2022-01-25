package com.spring.elk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class SpringElkExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringElkExampleApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		log.info("----------------LOG START-----------------");
		
		log.info("Author : htyesilyurt@gmail.com");

		log.info("----------------LOG FINISH-----------------");
	}

}
