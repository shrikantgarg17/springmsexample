package com.openshift.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {
	
	
	@GetMapping("/openshift/v1")
	public String welcome() {
		
		return "welcome to openshift";
	}
	
	@GetMapping("/openshift/{name}")
	public String welcome2(@PathVariable String name) {
		
		return "Hi..welcome to openshift"+ name ;
	}

	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
