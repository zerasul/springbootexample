package com.example.ejemplo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EjemploApplicationTests {

	@Autowired
	RestController restController;

	@Test
	void contextLoads() {
		assertEquals("Hello World",restController.sayHello());
	}

}
