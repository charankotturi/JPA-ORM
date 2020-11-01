package com.example.JPAdemo;

import com.example.JPAdemo.entities.person;
import com.example.JPAdemo.repository.JpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	public JpaRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("the person with id 1001 is -> {}", repository.findPersonByID(1001));
		logger.info("update -> {}", repository.update(new person("Lawde", "big shit", new Date())));
		logger.info("update -> {}", repository.update(new person(1001,"charan", "big shit", new Date())));
		repository.deleteById(1002);
		logger.info("All the people in the list are-> {}", repository.findALlPeople());

	}
}
