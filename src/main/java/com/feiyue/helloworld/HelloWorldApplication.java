package com.feiyue.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RestController
	class EchoController {
		@GetMapping(value = "/echo/{string}")
		public String echo(@PathVariable String string) {
			return "Hello Nacos Discovery " + string;
		}
	}
}
