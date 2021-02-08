package com.nhnrookie8.sample.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SampleAccountApplication {


	@RequestMapping("/")
	public String sampleOutput(){
		return "hello account";
	}

	public static void main(String[] args) {

		SpringApplication.run(SampleAccountApplication.class, args);

	}

}
