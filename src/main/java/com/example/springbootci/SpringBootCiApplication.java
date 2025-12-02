package com.example.springbootci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCiApplication {

	@GetMapping("/")
	public String hello(){
		return "ci process fourhqirweovgrpeuigberw";
	}

	@GetMapping("/hello")
	public String joke(){
		return "ci process joker";
	}

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCiApplication.class, args);
    }

}
