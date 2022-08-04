package com.myapp.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class DevopsGroovyProductsApplication extends SpringBootServletInitializer{

	static void main(String[] args) {
		SpringApplication.run(DevopsGroovyProductsApplication, args)
	}
	
	@GetMapping
	def sayHello() {
		return "Hello"
	}

}
