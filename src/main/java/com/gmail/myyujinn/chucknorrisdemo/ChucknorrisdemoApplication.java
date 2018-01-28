package com.gmail.myyujinn.chucknorrisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorrisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisdemoApplication.class, args);
	}
}
